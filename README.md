## Resumen del documento

El documento es un informe/laboratorio académico sobre el uso de **AWS CLI (Command Line Interface)** para manejar instancias **EC2 en AWS**.

### Puntos principales:
1. **Configuración inicial**  
   - Instalación de AWS CLI.  
   - Uso de `aws configure` para guardar credenciales y región.  
   - Creación de los archivos de configuración y credenciales.  

2. **Gestión de llaves (KeyPair)**  
   - Creación de una llave de seguridad (`MyKeyPair.pem`).  
   - Ajuste de permisos y verificación.  

3. **Red y Seguridad**  
   - Identificación del **VPC por defecto**.  
   - Creación de un **Security Group**.  
   - Adición de reglas de acceso (puerto 3389 para RDP, puerto 22 para SSH).  

4. **Instancias EC2**  
   - Listado de subnets disponibles.  
   - Obtención de la AMI más reciente de Amazon Linux mediante SSM.  
   - Lanzamiento de una instancia EC2 (`t2.micro`).  
   - Revisión de la información de la instancia.  

5. **Conexión y uso**  
   - Obtención del DNS público.  
   - Conexión vía SSH a la instancia EC2.  

6. **Limpieza de recursos**  
   - Terminación de la instancia.  
   - Eliminación del Security Group.  
   - Eliminación de la Key Pair y del archivo `.pem` local.  

### Conclusión
El documento muestra paso a paso cómo usar AWS CLI para:
- Configurar credenciales  
- Crear llaves y reglas de red  
- Lanzar y conectarse a una instancia EC2  
- Eliminar los recursos al final  

Se trata de un tutorial práctico y documentado para aprender a manejar instancias EC2 desde la línea de comandos, como parte del curso **AREP (Arquitectura Empresarial)**.
