import pandas as pd



file1=input('Ruta del primer archivo: ')#Ruta con su extension

file2=input('Ruta del segudno archivo: ')#Ruta con su extension
path_save=input('Ruta carpeta de guardado: ')#Ruta con su 

data_different= pd.DataFrame(set(pd.read_csv(file1))-set(pd.read_csv(file2))) #Se compara que numeros del file1 no se encuentran en el file2.
data_different.to_csv(path_save+'/'+'numbers_differents.csv')

