# 3.2 API REST segura de Android

Contruir una app Android segura que consuma servicios REST.

## Codigo de honor:
Debes seguir el Código de honor del ingeniero de sistemas para defender el estándar de integridad académica de la ECI:

* Tus respuestas a tareas, cuestionarios y exámenes deben ser tu propio trabajo (excepto para las tareas que permiten explícitamente la colaboración).

* No puedes compartir tus soluciones de tareas, cuestionarios o exámenes con otra persona a menos que el instructor lo permita explícitamente. Esto incluye cualquier cosa escrita por ti, como también cualquier solución oficial proporcionada por el docente o el monitor del curso.

* No puedes participar en otras actividades que mejorarán de manera deshonesta tus resultados o que mejorarán de manera deshonesta o dañarán los resultados de otras personas.

## Prerrequisitos

### Git

```
> git --version

git version 2.21.0.windows.1
```

### gradle

```
> gradle -version

------------------------------------------------------------
Gradle 6.6.1
------------------------------------------------------------

Build time:   2020-08-25 16:29:12 UTC
Revision:     f2d1fb54a951d8b11d25748e4711bec8d128d7e3

Kotlin:       1.3.72
Groovy:       2.5.12
Ant:          Apache Ant(TM) version 1.10.8 compiled on May 10 2020
JVM:          1.8.0_261 (Oracle Corporation 25.261-b12)
OS:           Windows 10 10.0 amd64
```

### Android Studio

## Instalación

Para descargar localmente el repositorio se utiliza el comando como sigue:
```
git clone https://github.com/Diego23p/IETI_12.git
```

## Parte 1: Actividad lanzamineto y actividad de Login

Usuario: diego.puerto

Contraseña: test

![](/img/1.png)

![](/img/2.png)

![](/img/3.png)

## Parte 2: Implementación de capa de red

- Al inicial correctamente re redirige a ```MainActivity``` (con el botón de correo se da un mensaje de bienvenida al usuario logueado que fue almacenado en ```SharedPreferences```):

![](/img/4.png)

- Se cierra la aplicación:

![](/img/5.png)

y se comprueba que al abrirla entra directamente a ```MainActivity```, persiste la información del email en ```SharedPreferences```

![](/img/6.png)

- El botón ```LOGOUT``` redirige a ```LoginActivity```

![](/img/7.png) -------->
![](/img/8.png)
