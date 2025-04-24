#!/bin/bash

# Atualizar os pacotes do sistema
echo "Atualizando os pacotes..."
sudo apt update -y

# Instalando o Apache
echo "Instalando o Apache..."
sudo apt install apache2 -y

# Iniciar o serviço Apache e configurar para iniciar automaticamente
echo "Iniciando o Apache e configurando para iniciar automaticamente..."
sudo systemctl start apache2
sudo systemctl enable apache2

# Verificando status do Apache
echo "Verificando o status do Apache..."
sudo systemctl status apache2

# Configurando o firewall para liberar a porta 80
echo "Configurando o firewall para liberar a porta 80..."
sudo ufw allow 'Apache Full'

# Criando diretórios padrão
echo "Criando diretórios de site..."
sudo mkdir -p /var/www/html/meusite

# Definindo permissões
echo "Definindo permissões para o diretório..."
sudo chown -R $USER:$USER /var/www/html/meusite

# Criando uma página HTML de teste
echo "Criando uma página de teste..."
echo "<html>
  <head>
    <title>Servidor Apache</title>
  </head>
  <body>
    <h1>Bem-vindo ao servidor Apache provisionado automaticamente!</h1>
  </body>
</html>" | sudo tee /var/www/html/meusite/index.html

# Reiniciando o Apache para aplicar as alterações
echo "Reiniciando o Apache..."
sudo systemctl restart apache2

# Status final
echo "Servidor Apache provisionado com sucesso!"
echo "Acesse o site no navegador: http://$(hostname -I)"
