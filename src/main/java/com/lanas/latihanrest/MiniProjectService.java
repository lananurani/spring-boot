package com.lanas.latihanrest;

import model.MiniProject;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class MiniProjectService {

    List<MiniProject> projectList = new ArrayList<MiniProject>(Arrays.asList(
            new MiniProject("1", "TK", "Transaksi Keluar"),
            new MiniProject("2", "TM", "Transaksi Masuk"),
            new MiniProject("3", "RK", "Reklas Keluar"),
            new MiniProject("4", "RM", "Reklas Masuk")
    ));

    public List<MiniProject> getAllMiniProject(){
        return projectList;
    }

    public MiniProject getMiniProject(String  no){
        return projectList.stream().filter(t -> t.getNo().equals(no)).findFirst().get();
    }

    public void addMiniProject(MiniProject miniProject) {
        projectList.add(miniProject);
    }

    public void updateMiniProject(MiniProject miniProject, String no) {
        for (int i =0 ; i <projectList.size(); i++){
            MiniProject miniProject1 = projectList.get(i);

            if(miniProject1.getNo().equals(no)){
                projectList.set(i, miniProject);
            }
        }
    }

    public void deleteMiniProject(String no) {
        projectList.removeIf(t -> t.getNo().equals(no));
    }
}
