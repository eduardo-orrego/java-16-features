# java-16-features

## New Features:
- JDK-8180352 - Add Stream.toList() method
- JEP 395: Records

## New Incubator modules:
- JEP 338: Vector API (Incubator)

## Configurations to use "Incubator modules" in Java 16

#### Settings > Build, Execution, Deployment > Compiler > Java Compiler :

-- Project bytecode version: 16

-- Javac Options > Additional command line parameters: --add-modules [module package]

example: --add-modules jdk.incubator.vector

#### Run/Debug Configurations > Application > [Choose Application] :

-- Build and Run > Modify Options > Add VM Options> VM Options : --add-modules [module package]

example: --add-modules jdk.incubator.vector