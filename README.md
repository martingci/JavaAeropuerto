# Digitalización de la Gestión de Procesos en un Aeropuerto

El proyecto tiene como objetivo automatizar el proceso de recepción de pasajeros en el aeropuerto para evitar aglomeraciones de personas, mejorando la gestión de los procesos aeroportuarios.

## Requisitos del Sistema

### 1. Gestión de Vuelos y Aeropuertos
- Un aeropuerto debe ser capaz de gestionar varios aviones.
- Cada avión está constituido por varios vuelos.
- Cada vuelo está asociado a una ciudad de origen y una ciudad de destino.
- El vuelo debe almacenar:
    - Fecha
    - Lugar de inicio
    - Lugar de destino

### 2. Gestión de Personas
- Las personas en un vuelo se dividen en pasajeros y pilotos.
- **Pasajeros**: No tienen acceso a la información de los vuelos para proteger la privacidad del resto de los pasajeros.
- **Pilotos**: Tienen acceso a la información del vuelo en el que están inscritos.

### 3. Pasaportes
Cada pasajero debe portar un pasaporte que debe contener:
- ID
- Nacionalidad
- Cantidad de hojas disponibles
- Fecha de expiración

## Funcionalidades Requeridas

1. **Crear vuelos y registrar aviones.**
2. **Registrar pasajeros y pilotos de avión en un vuelo.**
3. **Validar pasaportes**: Verificar que cada pasaporte no esté expirado y tenga hojas disponibles.
4. **Búsqueda de vuelos por fecha**: Buscar todos los usuarios que tienen un vuelo en una fecha determinada.
5. **Seguimiento de vuelo**: Buscar a todos los usuarios de un mismo vuelo para realizar seguimiento en caso de ser necesario.