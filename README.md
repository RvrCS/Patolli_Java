# Patolli Java
![Patolli](https://user-images.githubusercontent.com/75063620/204179461-c6c80d18-4fec-4db4-b7df-5784029cde75.png)

## Equipo Blackboard
- Torres Urrutia River Damian
- Ruiz Tapia Joshiva Yzair
- Soto López Nadia Alejandra

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
![DominioDC](https://user-images.githubusercontent.com/75063620/204172369-59413c8b-bd49-47a9-ab1c-dda3d0f84a4c.png)

- Casilla: Se encarga de representar las casillas del tablero, para posteriormente poder ser usada dependiendo de su funcionalidad y del tipo de casillas que son.
- **LugarTriangulo:** Se encarga de definir el tipo de casilla al momento de crearla.
- **LugarSemicirculo:** Se encarga de definir el tipo de casilla al momento de crearla.
- **Ficha:** Es la encargada de representar una ficha en el juego y su función es la de representar los movimientos en el tablero de un jugador y condicionar si un - jugador es ganador del juego o no.
- **Tablero:** Es la encargada de guardar todas las casillas generadas en el juego y su función es servir como almacén para poder utilizar las casillas durante el - juego.
- **Juego:** Es la encargada de guardar toda la información en el juego, en esta clase se realizan todos los cambios que vayan ocurriendo durante la sesión del juego, así mismo se establecen las reglas del juego.
- **Jugador:** Es la encargada de representar a un jugador y su función es la de guardar la información del mismo, como fichas, nombre, color y fondo del jugador.

## GUI Patolli
![PatolliguiDC](https://user-images.githubusercontent.com/75063620/204172394-dbe8c1eb-6b84-49d5-894c-d8c93e9eb0c0.png)

- **menu:** GUI que se encarga de mostrar al usuario la opción de crear una partida, unirse a una partida existente o simplemente salir del juego.
- **crearPartida:** El usuario al crear una partida configura el número de casillas por aspa, configura el número de jugadores, fondo de apuesta, cabe mencionar que el fondo de apuesta es configurable al igual que el monto por apuesta.
- **ventanaTablero:** El GUI de ventana tablero se encarga de mostrar el nombre de los jugadores en la partida, indica el color de ficha de cada jugador, muestra el fondo de apuesta de cada jugador y el monto de apuesta que se le asignó a la partida.
- **creaJugador:** Se encarga de crear al jugador, aquí se le pide al jugador que ingrese su nombre, y así mismo que seleccione el color de su ficha (al hacer - esto el color seleccionado va a desaparecer para los próximos jugadores y evitar que seleccionen el mismo color de ficha).
- **tableroCanvas:** Clase que se encarga de dibujar el tablero.
- **dibujaCasilla:** Clase que se encarga de dibujar las casillas después de que el tablero canvas fue creado, en esta clase existe un método para crear cada tipo de casilla que conforman el tablero es decir se encarga de dibujar las casillas de en medio, casillas al final de las aspas, casillas triangulares, casilla exclusiva del jugador y por último las casillas normales.
- **dibujaFicha:** Esta clase que se encarga de dibujar la ficha en la casilla correspondiente.

## Blackboard Patolli
![BlackboardDC](https://user-images.githubusercontent.com/75063620/204172403-0c95b0f9-3281-40d1-aa19-99b351f65f7e.png)

- **IObservable:** Clase abstracta que propina información de notificación
- **AbstractObservable:** Clase encargada de crear observables, estableciendo una estructura fija que todo quien heredé de él debe tener.
- **IObserver:** Clase abstracta que recibe notificaciones
- **controlBlackboard:** Clase la cual estará observando al blackboard a la escucha de un cambio.
- **blackboard:** Clase la cual será modificada por la fuente de conocimiento cuando la clase control detecte algún cambio llamando a la fuente de conocimiento para que realice esos cambios.
- **IFuenteConocimiento:** Explicación
- **controlFicha:** Es la encargada de establecer todos los métodos relacionados con la ficha y su función es la de realizar “X” acción en una ficha dependiendo el evento al que se responda.
- **controlPartida:** Es la encargada de establecer todos los métodos relacionados que se utilizaran en la partida y su función es la de realizar “X” acción en la partida dependiendo el evento al que se responda.
- **controlApuesta:** Es la encargada de establecer todos los métodos relacionados que se utilizan durante el pago de una apuesta en la partida y su función es la de realizar “X” acción dependiendo el evento al que responda.

# Diagrama de Paquetes
![PatolliDP](https://user-images.githubusercontent.com/75063620/204177510-15243ac8-f9ff-42eb-a42f-7b542e444c6a.png)

# Diagrama de Componentes
![PatolliDCOMP](https://user-images.githubusercontent.com/75063620/204172418-e90e5c8b-0b86-4caf-b8ac-bcbc0b41fd1e.png)

En este diagrama de componentes podemos observar el componente ***patolli_gui*** el cual contiene todo el control de vista hacia el usuario. <br>
Este mismo componente tiene un subsistema el cual se encarga del control del socket cliente. El cual no servira para la conexión entre un socket server.

El componente ***Blackboard*** es donde tenemos implementada nuestra arquitectura (Blackboard), y a su vez tiene un subsistema server socket <br>
el cual estara al a escucha de clientes para poder recibir y mandar información.

El componenete ***DominioPatolli*** es el que tiene implementada nuestras clases del Patolli.

El componente ***Patolli_gui*** depende del componente ***blackboard*** para poder actualizar a cada cliente la *juego*, y el blackboard depender del dominio para la modificación del *juego*.

# Diagrama de Despliegue
![PatolliDD](https://user-images.githubusercontent.com/75063620/204178947-0491a0b1-400e-4e2c-aabb-b1b399215795.png)

- **Client:** El nodo client es donde el usuario en su PC tendra los componentes de patolli_gui el cual le mostrara la interfaz de Patolli, y tambien contiene el subsistema ClienteSocket. <br>
- **Server:** El nodo server es la misma PC del usuario en donde tendra los componentes blackboard para controlar lo que pasara en la interfaz Patolli, tambien contiene el subsistema ServerSocket para recibir los clientes y enviar actualizaciones al juego de cada jugador. <br> <br>
Estos nodos se comunicaran a través de un puerto TCP/IP por medio de los subsistemas sockets de cada nodo.

