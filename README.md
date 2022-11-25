# Patolli Java
## Equipo
### Torres Urrutia River Damian
### Ruiz Tapia Joshiva Yzair
### Soto López Nadia Alejandra

# Explicación de Patolli
El patolli es un antiguo juego mesoamericano de azar y apuestas. Durante la época precolombina fue practicado por teotihuacanos, toltecas, mayas, aztecas y el resto de los pueblos conquistados por los grandes imperios. <br>
El tablero es en forma de aspa (X), se permite de 2 a 4 jugadores por juego, cada jugador inicia con 6 fichas (cada jugador con su respectivo color) que irán avanzando por las casillas en dirección de las agujas del reloj, pasando por todas las casillas hasta llegar a la salida, que será la misma aspa por la que se inició.  <br>
Cada jugador podrá lanzar 5 dados y avanzar las casillas que según le corresponda, también tendrán un fondo de apuesta fijo y un monto para apostar a la vez. En el juego existen diferentes reglas en cuanto a los movimientos. 

# Estilo Arquitectonico
El patrón Blackboard es un modelo  arquitectónico de software habitualmente utilizado en sistemas expertos, multiagente y basados en el conocimiento.
La arquitectura en pizarra consta de múltiples elementos funcionales, denominados agentes, y un instrumento de control denominado pizarra.
La estructura del patrón es la siguiente:
– Fuente de conocimiento: proveen áreas de conocimiento particulares que aportan hipótesis de la solución y son las encargadas de leer y escribir en la pizarra.
– Pizarra: estructura de datos central. Provee de una interfaz que permite a todas las fuentes de conocimiento leer y escribir en él.
– Control: monitorea los cambios en la pizarra y decide qué acciones tomará.
 

# Diagramas de Clases

## Dominio Patolli
- Casilla: Explicación
- LugarTriangulo: Explicación
- LugarSemicirculo: Explicación
- Ficha: Explicación
- Tablero: Explicación
- Juego: Explicación
- Jugador: Explicación

## GUI Patolli

- menu: Explicación
- crearPartida: Explicación
- ventanaTablero: Explicación
- creaJugador: Explicación
- tableroCanvas: Explicación
- dibujaCasilla: Explicación
- dibujaFicha: Explicación

## Blackboard Patolli

- IObservable: Explicación
- AbstractObservable: Explicación
- IObserver: Explicación
- controlBlackboard: Explicación
- blackboard: Explicación
- IFuenteConocimiento: Explicación
- controlFicha: Explicación
- controlPartida: Explicación
- controlApuesta: Explicación

# Diagrama de Paquetes
# Diagrama de Componentes
# Diagrama de Despliegue

