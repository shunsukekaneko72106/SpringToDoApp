package com.example.springtodoapp.app.task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.springtodoapp.service.TaskService;

@Controller
@RequestMapping("/task")
public class TaskController {
  
  //クラスを呼び出し
  // private final TaskService taskService;

  // @Autowired
  // public TaskController(TaskService taskService) {
  //     this.taskService = taskService;
  // }

    /**
   * タスクの一覧を表示します
   * @param taskForm
   * @param model
   * @return resources/templates下のHTMLファイル名
   */
  @GetMapping
  public String task(Model model) {

    //新規登録か更新かを判断する仕掛け

    //Taskのリストを取得する
    // model.addAttribute("list", "");
    // model.addAttribute("title", "タスク一覧");

    System.out.println("taskメソッドが呼ばれました。");
    return "task/index";
  }
}
