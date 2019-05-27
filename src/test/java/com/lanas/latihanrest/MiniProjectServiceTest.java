package com.lanas.latihanrest;

import model.MiniProject;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
public class MiniProjectServiceTest {

    @Autowired
    MiniProjectService service;

    private String no;
    private MiniProject miniProject;
    private List<MiniProject> projectList;

    @Before
    public void setup(){
        projectList = new ArrayList<MiniProject>(Arrays.asList(
                new MiniProject("1", "TK", "Transaksi Keluar"),
                new MiniProject("2", "TM", "Transaksi Masuk"),
                new MiniProject("3", "RK", "Reklas Keluar"),
                new MiniProject("4", "RM", "Reklas Masuk")
        ));

        no = "1";

        miniProject = new MiniProject();
        miniProject.setNo("5");
        miniProject.setCode("AK");
        miniProject.setDescription("Aset Keluar");
    }

    @TestConfiguration
    static class MiniProjectServiceTestContextConfiguration {
        @Bean
        public MiniProjectService getMiniProjectService() {
            return new MiniProjectService();
        }
    }

    @Test
    public void getAllMiniProject(){
        List<MiniProject> result = service.getAllMiniProject();
        assertNotNull(result);
        assertEquals(4, result.size());
        assertTrue(result.get(0) instanceof MiniProject);
        assertTrue(result.get(1) instanceof MiniProject);
        assertTrue(result.get(2) instanceof MiniProject);
        assertTrue(result.get(3) instanceof MiniProject);
    }

    @Test
    public void getMiniProject(){
        no = "1";
        MiniProject result = service.getMiniProject(no);
        assertNotNull(result);
        assertEquals("TK", result.getCode());
        assertEquals("Transaksi Keluar", result.getDescription());
    }

    @Test
    public void addMiniProject(){
        service.addMiniProject(miniProject);
    }

    @Test
    public void updateMiniProject(){
        service.updateMiniProject(miniProject, no);
    }

    @Test
    public void deleteMiniProject(){
        service.deleteMiniProject(no);
    }
}
