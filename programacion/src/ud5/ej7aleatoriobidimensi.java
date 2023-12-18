package ud5;

import java.util.Random;
// Escribe un programa que muestre tres apuestas de la quiniela en tres columnas para los 14
//partidos y el pleno al quince (15 filas).
public class ej7aleatoriobidimensi {

	public static void main(String[] args) {
		        // Definir los resultados posibles de un partido
		        String[] resultados = {"1", "X", "2"};

		        // Generar y mostrar tres apuestas
		        for (int i = 0; i < 1; i++) {
		            System.out.println("Apuesta " + (i + 1) + ":");
		            String[][] quiniela = generarQuiniela(resultados);
		            mostrarQuiniela(quiniela);
		            System.out.println();
		        }
		    }

		    public static String[][] generarQuiniela(String[] resultados) {
		        Random ale = new Random();
		        String[][] quini = new String[15][3];

		        // Generar apuestas para los 14 partidos
		        for (int i = 0; i < 14; i++) {
		            for (int j = 0; j < 3; j++) {
		                quini[i][j] = resultados[ale.nextInt(resultados.length)];
		            }
		        }

		        // Generar apuesta para el pleno al quince
		        for (int j = 0; j < 3; j++) {
		            quini[14][j] = resultados[ale.nextInt(resultados.length)];
		        }

		        return quini;
		    }

		    public static void mostrarQuiniela(String[][] quiniela) {
		        for (int i = 0; i < 15; i++) {
		            for (int j = 0; j <3 ; j++) {
		                System.out.print(quiniela[i][j] + " ");
		            }
		            System.out.println();
		        }
		    }
		}

