package com.lanas.latihanrest;

import model.MiniProject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MiniProjectController {

    @Autowired
    MiniProjectService miniProjectService;

    @RequestMapping("/miniproject")
    public List<MiniProject> getAllMiniProject(){
        return miniProjectService.getAllMiniProject();
    }

    @RequestMapping("/miniproject/{no}")
    public MiniProject getMiniProject(@PathVariable String no){
        return miniProjectService.getMiniProject(no);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/miniproject")
    public void addMiniProject(@RequestBody MiniProject miniProject){
        miniProjectService.addMiniProject(miniProject);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/miniproject/{no}")
    public void updateMiniProject(@RequestBody MiniProject miniProject, @PathVariable String no){
        miniProjectService.updateMiniProject(miniProject, no);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/miniproject/{no}")
    public void deleteMiniProject(@PathVariable String no){
        miniProjectService.deleteMiniProject(no);
    }

}
