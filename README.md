# java-16-features

### Configurations to use "Preview" features in Java 16

#### Settings > Build, Execution, Deployment > Compiler > Java Compiler :

-- Project bytecode version: 16

-- Override compiler parameters per-module:

- Module: java-16-features
- Compilation Options: --enable-preview

Run/Debug Configurations > Application > [Choose Application] :

Build and Run > Modify Options > Add VM Options : --enable-preview

# New Features
- JDK-8180352 - Add Stream.toList() method
