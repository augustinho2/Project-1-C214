package br.inatel.cdg.service;

import br.inatel.cdg.model.Game;
import br.inatel.cdg.model.Platform;
import br.inatel.cdg.model.Publisher;
import br.inatel.cdg.utils.CsvUtils;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class TesteServiceGame {

    private static List<Game> gameList;

    @BeforeClass
    public static void initClass() throws URISyntaxException {
        Path caminho = Paths.get(ClassLoader.getSystemResource("vendas-games.csv").toURI());
        gameList = CsvUtils.readGameCsv(caminho);
    }

    @Test
    public void testeGamesPS4(){
        List<Game> ps4Games = ServiceGame.getListByPlatform(gameList, Platform.PS4);

        Assert.assertEquals(5,ps4Games.size());
    }

    @Test
    public void testeGameX360(){
        List<Game> x360Games = ServiceGame.getListByPlatform(gameList, Platform.X360);

        Assert.assertEquals(16,x360Games.size());
    }

    @Test
    public void testeGameActivision(){
        List<Game> activisionGames = ServiceGame.getByPuBlisher(gameList, Publisher.Activision);

        Assert.assertEquals(14,activisionGames.size());
    }

    @Test
    public void testeGameMicrosoft(){
        List<Game> microsoftGames = ServiceGame.getByPuBlisher(gameList, Publisher.MicrosoftGameStudios);

        Assert.assertEquals(6,microsoftGames.size());
    }

    @Test
    public void testeGameGB(){
        List<Game> x360Games = ServiceGame.getListByPlatform(gameList, Platform.GB);

        Assert.assertEquals(6,x360Games.size());
    }

    @Test
    public void testeGameGBA(){
        List<Game> x360Games = ServiceGame.getListByPlatform(gameList, Platform.GBA);

        Assert.assertEquals(2,x360Games.size());
    }

    @Test
    public void testeGamePS3(){
        List<Game> x360Games = ServiceGame.getListByPlatform(gameList, Platform.PS3);

        Assert.assertEquals(9,x360Games.size());
    }

    @Test
    public void testeGamePS2(){
        List<Game> x360Games = ServiceGame.getListByPlatform(gameList, Platform.PS2);

        Assert.assertEquals(6,x360Games.size());
    }

    @Test
    public void testeGamePC(){
        List<Game> x360Games = ServiceGame.getListByPlatform(gameList, Platform.PC);

        Assert.assertEquals(1,x360Games.size());
    }


    @Test
    public void testeGameXB(){
        List<Game> x360Games = ServiceGame.getListByPlatform(gameList, Platform.XB);

        Assert.assertEquals(1,x360Games.size());
    }

}
