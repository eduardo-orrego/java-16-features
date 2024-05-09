# java-16-features

## New Features:
- JDK-8180352 - Add Stream.toList() method
- JEP 395: Records
- JDK-8250623 - JEP 394: Pattern Matching for instanceof

## New Incubator modules:
- JEP 338: Vector API (Incubator)

## New Preview Features:
- JEP 397: Sealed Classes (Second Preview)

## Configurations to use "Incubator modules" in Java 16

#### Settings > Build, Execution, Deployment > Compiler > Java Compiler :

-- Project bytecode version: 16
-- Javac Options > Additional command line parameters: --add-modules [module package]

example: --add-modules jdk.incubator.vector

#### Run/Debug Configurations > Application > [Choose Application] :

-- Build and Run > Modify Options > Add VM Options> VM Options : --add-modules [module package]

example: --add-modules jdk.incubator.vector

## Configurations to use "Preview" features in Java 16

#### Settings > Build, Execution, Deployment > Compiler > Java Compiler :

-- Project bytecode version: 16
-- Javac Options > Override compiler parameters per-module: > click "+" button > Add Module :
- Module: java-15-features
- Compilation Options: --enable-preview

Run/Debug Configurations > Application > [Choose Application] :

Build and Run > Modify Options > Add VM Options : --enable-preview