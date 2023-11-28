import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.LinkedList;

public class SnakeGame extends JPanel implements ActionListener {
    private LinkedList<Point> snake;
    private int direction;
    private Point food;
    private boolean isRunning;
    private Timer timer;

    public static final int TILE_SIZE = 20;
    public static final int WIDTH = 20;
    public static final int HEIGHT = 15;

    public SnakeGame() {
        snake = new LinkedList<>();
        direction = KeyEvent.VK_RIGHT;
        food = new Point(5, 5);
        isRunning = true;

        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                int newDirection = e.getKeyCode();
                if (newDirection == KeyEvent.VK_LEFT && direction != KeyEvent.VK_RIGHT) {
                    direction = newDirection;
                } else if (newDirection == KeyEvent.VK_RIGHT && direction != KeyEvent.VK_LEFT) {
                    direction = newDirection;
                } else if (newDirection == KeyEvent.VK_UP && direction != KeyEvent.VK_DOWN) {
                    direction = newDirection;
                } else if (newDirection == KeyEvent.VK_DOWN && direction != KeyEvent.VK_UP) {
                    direction = newDirection;
                }
            }
        });

        setFocusable(true);
        timer = new Timer(100, this);
        timer.start();
    }

    public void actionPerformed(ActionEvent e) {
        if (isRunning) {
            move();
            checkCollision();
            checkFood();
            repaint();
        }
    }

    private void move() {
        Point newHead = snake.getFirst();
        if (direction == KeyEvent.VK_RIGHT) {
            newHead = new Point(newHead.x + 1, newHead.y);
        } else if (direction == KeyEvent.VK_LEFT) {
            newHead = new Point(newHead.x - 1, newHead.y);
        } else if (direction == KeyEvent.VK_UP) {
            newHead = new Point(newHead.x, newHead.y - 1);
        } else if (direction == KeyEvent.VK_DOWN) {
            newHead = new Point(newHead.x, newHead.y + 1);
        }
        snake.addFirst(newHead);
        if (newHead.equals(food)) {
            food.setLocation((int) (Math.random() * WIDTH), (int) (Math.random() * HEIGHT));
        } else {
            snake.removeLast();
        }
    }

    private void checkCollision() {
        Point head = snake.getFirst();
        if (head.x < 0 || head.x >= WIDTH || head.y < 0 || head.y >= HEIGHT || snake.contains(head, 1)) {
            isRunning = false;
            timer.stop();
        }
    }

    private void checkFood() {
        Point head = snake.getFirst();
        if (head.equals(food)) {
            food.setLocation((int) (Math.random() * WIDTH), (int) (Math.random() * HEIGHT));
        }
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, getWidth(), getHeight());

        g.setColor(Color.GREEN);
        for (Point p : snake) {
            g.fillRect(p.x * TILE_SIZE, p.y * TILE_SIZE, TILE_SIZE, TILE_SIZE);
        }

        g.setColor(Color.RED);
        g.fillOval(food.x * TILE_SIZE, food.y * TILE_SIZE, TILE_SIZE, TILE_SIZE);

        if (!isRunning) {
            g.setColor(Color.WHITE);
            g.setFont(new Font("SansSerif", Font.BOLD, 48));
            g.drawString("Game Over", 120, getHeight() / 2);
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Snake Game");
        SnakeGame snakeGame = new SnakeGame();
        frame.add(snakeGame);
        frame.setSize(WIDTH * TILE_SIZE, HEIGHT * TILE_SIZE);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}