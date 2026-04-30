# Abyss Crawler Legacy (1.7.10)

[![Build Status](https://github.com/sobrinhocdg/abyss-crawler-legacy/actions/workflows/build.yml/badge.svg)](https://github.com/sobrinhocdg/abyss-crawler-legacy/actions)
[![Minecraft Version](https://img.shields.io/badge/Minecraft-1.7.10-green.svg)](https://minecraft.net/)
[![Forge Version](https://img.shields.io/badge/Forge-10.13.4.1614-red.svg)](https://files.minecraftforge.net/)

## 🌟 Sobre o Mod

**Abyss Crawler Legacy** é uma versão portada e otimizada do mod original *Abyss Crawler* (para Minecraft 1.14.4), desenvolvida especificamente para **Minecraft 1.7.10**. Esta versão foi criada para rodar perfeitamente em hardware antigo, como processadores dual-core (ex: Intel Pentium B950), mantendo toda a diversão e exploração do abismo infinito!

### ✨ Recursos Principais

- **Geração de Mundo Procedural**: Explore um abismo infinito com corredores, salas e estruturas interconectadas
- **11 Blocos Personalizados**: Pedra, terra, grama, obsidiana, portal, baú, spawner, tijolos, pilares e lanternas do abismo
- **14 Items Exclusivos**: Essência, fragmentos, lingotes, ferramentas, armaduras e comida do abismo
- **Sistema de Loot RPG**: Baús com diamantes, esmeraldas e equipamentos raros
- **Spawners de Inimigos**: Áreas específicas com geradores de mobs
- **Verticalidade**: Passagens entre diferentes camadas do abismo
- **Otimização Extrema**: Código leve que roda suavemente em PCs antigos

## 📥 Instalação

### Pré-requisitos
- Minecraft 1.7.10 instalado
- Forge 10.13.4.1614 para Minecraft 1.7.10

### Passo a Passo

1. **Baixe o arquivo JAR mais recente**:
   - Vá até a página de [Releases](https://github.com/sobrinhocdg/abyss-crawler-legacy/releases) ou
   - Acesse a seção de [Actions](https://github.com/sobrinhocdg/abyss-crawler-legacy/actions) e baixe o artifact da build mais recente

2. **Instale o Forge**:
   - Baixe o instalador do Forge para Minecraft 1.7.10 (versão 10.13.4.1614)
   - Execute o instalador e selecione "Install Client"

3. **Adicione o mod**:
   - Coloque o arquivo `abyss-crawler-legacy-1.0.0.jar` na pasta `mods` do seu Minecraft
   - Caminho típico: `%appdata%/.minecraft/mods` (Windows) ou `~/Library/Application Support/minecraft/mods` (Mac)

4. **Jogue!**:
   - Inicie o Minecraft com o perfil Forge 1.7.10
   - Crie um novo mundo ou entre em um existente
   - Procure pelo santuário de obsidiana para começar sua aventura no abismo!

## 🔨 Compilação (Para Desenvolvedores)

Se você deseja compilar o mod a partir do código fonte:

### Requisitos
- JDK 8 (Java 8)
- Git

### Passos

```bash
# Clone o repositório
git clone https://github.com/sobrinhocdg/abyss-crawler-legacy.git
cd abyss-crawler-legacy

# No Windows
gradlew.bat build --no-daemon

# No Linux/Mac
./gradlew build --no-daemon
```

O arquivo JAR será gerado em `build/libs/abyss-crawler-legacy-1.0.0.jar`

### Usando GitHub Actions

O projeto inclui um workflow automático que compila o mod a cada commit. Para baixar:
1. Vá até a aba **Actions** no GitHub
2. Clique no workflow mais recente
3. Na seção "Artifacts", baixe o arquivo `abyss-crawler-legacy.zip`
4. Extraia e use o JAR contido

## 🎮 Como Jogar

1. **Encontre o Santuário**: Procure por uma estrutura de obsidiana no mundo normal
2. **Ative o Portal**: Use os blocos do santuário para entrar no abismo
3. **Explore**: Desça pelas camadas, enfrente inimigos e colete recursos
4. **Progrida**: Craft ferramentas e armaduras do abismo para sobreviver nas camadas mais profundas
5. **Colete Loot**: Encontre baús com itens valiosos espalhados pelo abismo

## 📝 Créditos

- **Autor Original**: Criador do mod Abyss Crawler para 1.14.4
- **Port para 1.7.10**: sobrinhocdg
- **Baseado em**: [Abyss Crawler Original](https://github.com/seus-link-aqui) (versão 1.14.4)

## 🐛 Problemas Conhecidos

- Este mod é compatível apenas com Minecraft 1.7.10
- Requer Forge 10.13.4.1614 ou versão compatível
- Pode não funcionar com outros mods que modificam a geração de mundo

## 📬 Suporte

Se encontrar bugs ou tiver sugestões:
- Abra uma [Issue](https://github.com/sobrinhocdg/abyss-crawler-legacy/issues) no GitHub
- Discuta na seção de [Discussions](https://github.com/sobrinhocdg/abyss-crawler-legacy/discussions)

## 📄 Licença

Este projeto está licenciado sob a mesma licença do mod original. Consulte o arquivo LICENSE para mais detalhes.

---

**Divirta-se explorando o abismo!** 🌑⛏️
