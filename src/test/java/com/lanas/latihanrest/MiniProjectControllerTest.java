package com.lanas.latihanrest;

import model.MiniProject;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class MiniProjectControllerTest {
    @InjectMocks
    MiniProjectController controller;

    @Mock
    MiniProjectService service;

    private String no;
    private MiniProject project;
    private List<MiniProject> projectList;

    @Before public void setup(){
        no="5";

        project = new MiniProject();
        project.setDescription("deskripsi");

        projectList = new ArrayList<>();
        projectList.add(project);
    }

    @Test
    public void getAllMiniProject(){
        when(service.getAllMiniProject()).thenReturn(projectList);

        List<MiniProject>  result = controller.getAllMiniProject();
        assertNotNull(result);
        assertEquals(1, result.size());
        assertEquals(projectList, result);
        assertEquals(project, result.get(0));
    }

    @Test
    public void getMiniProject(){
        when(service.getMiniProject(no)).thenReturn(project);

        MiniProject result = controller.getMiniProject(no);
        assertEquals(project, result);
    }

    @Test
    public void addMiniProject(){
        doNothing().when(service).addMiniProject(project);

        controller.addMiniProject(project);
    }

    @Test
    public void updateMiniProject(){
        doNothing().when(service).updateMiniProject(project, no);

        controller.updateMiniProject(project, no);
    }

    @Test
    public void deleteMiniProject(){
        doNothing().when(service).deleteMiniProject(no);

        controller.deleteMiniProject(no);
    }
}
