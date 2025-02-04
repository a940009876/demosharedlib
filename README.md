# demosharedlib
POC Weblogic 12c Shared Libraries

![Shared Libraries](Shared-Library.drawio.png)

## Prerequisites
- Java JDK 1.8
- Maven 3.9.9
- Weblogic 12c (for deployment only)

## Order to build, package and deploy
1. sharedliba
2. sharedlibb
3. demoa
4. demob

## Compile and Package

### sahredliba
```bash
cd sharedliba
mvn clean package
```

### sahredlibb
```bash
cd sharedlibb
mvn clean package
```

### demoa
```bash
cd demoa
mvn clean package
```

### demob
```bash
cd demob
mvn clean package
```
