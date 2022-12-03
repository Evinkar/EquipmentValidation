package ru.Equipment.Validation.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.Equipment.Validation.DAO.EquipmentDAO;
import ru.Equipment.Validation.model.Equipment;

@Controller
@RequestMapping("/equipment")
public class EquipmentController {
    @Autowired
    private EquipmentDAO equipmentDAO;

    @GetMapping()
    public String ShowAll(Model model){
            model.addAttribute("equipList", equipmentDAO.ShowAll());
        return "ShowAll";
    }

    @GetMapping("/{id}")
    public String Show(@PathVariable("id") int id, Model model){
        model.addAttribute("equipment", equipmentDAO.Show(id));
        return "show";
    }

}
