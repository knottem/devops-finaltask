# Documentation för projektet

## Innehållsförteckning

- [Inledning](#inledning)
- [Starta projektet](#starta-projektet)
- [Använda projektet](#använda-projektet)

## Inledning

Detta projekt är en del av kursen Devops på Nackademin. I denna kurs fokuserar vi på DevOps delen därför är kod-delen väldigt enkel. Projektet använder sig av spring boot och gradle.

## Starta projektet

För att starta projektet behöver du ha docker och köra följande kommando:

```bash
docker run -p 8080:8080 -t ghcr.io/knottem/devops-finaltask:latest
```
Välj en annan port om du redan har något som lyssnar på port 8080. Exempel:
```bash
docker run -p 8081:8080 -t ghcr.io/knottem/devops-finaltask:latest
```

## Använda projektet

För att använda projektet behöver du enbart gå in på localhost:8080 i din webbläsare. Om du valde en annan port så byt ut 8080 mot den porten du valde.

### Calculator

Att använda calculator är väldigt enkelt. I URL:en så skriver du först in de två talen du vill räkna med och sedan vilken operation du vill göra.
```
http://localhost:PORT/calculate/FÖRSTA_TALET/ANDRA_TALET/OPERATION
```

De olika operationerna som finns är:
```
add
subtract
multiply
divide
```


Här är ett exempel ifall du valde port 8081 och vill räkna ut 5 + 3:
```
http://localhost:8081/calculate/5/3/add/
```
Detta kommer att returnera 8.

### Car

För att hämta en bil så skriver du in följande i URL:en:
```
http://localhost:PORT/car
```

Exempelvis:
```
http://localhost:8081/car
```
Detta kommer att returnera en bil i JSON-format.
