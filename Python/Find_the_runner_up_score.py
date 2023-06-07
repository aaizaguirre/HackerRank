'''Dada la hoja de puntaje de los participantes del Día del Deporte Universitario, debe encontrar el puntaje del subcampeón. Se le dan "n" puntuaciones. Guárdelos en una lista y encuentre la puntuación del subcampeón.
Formato de entrada:
La primera línea contiene "n". La segunda línea contiene una matriz "A" de "n" números enteros, cada uno separado por un espacio.
Restricciones:
            2 <= n <= 10
            -100 <= A[i] <= 100
Formato de salida:
            Imprime la puntuación del sub - campeón.'''       
n = int(input())
arr = list(map(int, input().split()))
arr.sort()
lista_unica = list(set(arr))
print(lista_unica[-2])
    