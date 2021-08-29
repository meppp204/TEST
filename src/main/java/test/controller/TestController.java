package test.controller;

import test.model.JubsokParam;
import test.model.SearchParam;
import lombok.Data;
import org.springframework.web.bind.annotation.*;
import test.model.entity.jubsokJum;
import org.springframework.beans.factory.annotation.Autowired;
import test.model.SearchParam;
import org.springframework.web.servlet.ModelAndView;
import test.repository.jubsokJumRepository;
import test.model.entity.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicReference;


@RestController
@Data
public class TestController {
    @Autowired
    private jubsokJumRepository jubsokJumRepository1;
    String gongsa = " ";
    String cable = " ";
    String jubsok = " ";
    String gugan = " ";
    String sigong = " ";
    String sangwiguk = " ";
    String hawiguk = " ";
    String sulchi = " ";
    String gamri = " ";
    String gwanri = " ";
    String core1 = " ";
    String core2 = " ";
    String core3 = " ";
    String core4 = " ";
    String core5 = " ";
    String core6 = " ";
    String core7 = " ";
    String core8 = " ";



    @RequestMapping("/vue-test")
    public ModelAndView greeting() {

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("vue-test");
        return modelAndView;
    }

    @RequestMapping("/create")
    public ModelAndView create() {

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("create");
        return modelAndView;
    }

    @RequestMapping("/findall")
    public ModelAndView findall(){

        List findlist = new ArrayList<>();
        findlist = jubsokJumRepository1.findAll();
        System.out.println(findlist);



        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("findall");
        modelAndView.addObject("findlist", findlist);

        return modelAndView;
    }


    @RequestMapping("/read")
    public ModelAndView read(@RequestParam Long id){


        Optional<jubsokJum> jubsokJum1 = Optional.ofNullable(jubsokJumRepository1.getOne(id));
        jubsokJum1.ifPresent(selectjubsokJum1 ->{
            System.out.println("OK" + selectjubsokJum1);
            System.out.println(selectjubsokJum1.getGongsa());

            setGongsa(selectjubsokJum1.getGongsa());
            setCable(selectjubsokJum1.getCableName());
            setJubsok(selectjubsokJum1.getJubsok());
            setGugan(selectjubsokJum1.getGugan());
            setSigong(selectjubsokJum1.getSigong());
            setSangwiguk(selectjubsokJum1.getSangwiguk());
            setHawiguk(selectjubsokJum1.getHawiguk());
            setSulchi(selectjubsokJum1.getSulchi());
            setGamri(selectjubsokJum1.getGamri());
            setGwanri(selectjubsokJum1.getGwanri());
            setCore1(selectjubsokJum1.getCore1());
            setCore2(selectjubsokJum1.getCore2());
            setCore3(selectjubsokJum1.getCore3());
            setCore4(selectjubsokJum1.getCore4());
            setCore5(selectjubsokJum1.getCore5());
            setCore6(selectjubsokJum1.getCore6());
            setCore7(selectjubsokJum1.getCore7());
            setCore8(selectjubsokJum1.getCore8());


        });
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("jubsok");
        modelAndView.addObject("gongsa", gongsa);
        modelAndView.addObject("cable", cable);
        modelAndView.addObject("jubsok", jubsok);
        modelAndView.addObject("gugan", gugan);
        modelAndView.addObject("sigong", sigong);
        modelAndView.addObject("sangwiguk", sangwiguk);
        modelAndView.addObject("hawiguk", hawiguk);
        modelAndView.addObject("sulchi", sulchi);
        modelAndView.addObject("gamri", gamri);
        modelAndView.addObject("gwanri", gwanri);
        modelAndView.addObject("core1", core1);
        modelAndView.addObject("core2", core2);
        modelAndView.addObject("core3", core3);
        modelAndView.addObject("core4", core4);
        modelAndView.addObject("core5", core5);
        modelAndView.addObject("core6", core6);
        modelAndView.addObject("core7", core7);
        modelAndView.addObject("core8", core8);


        return modelAndView;
    }

    @PostMapping(value = "/insert")
    public String postMethod(@RequestBody JubsokParam jubsokParam){
        System.out.println("파라미터:  "+jubsokParam);
        jubsokJum jubsokJum1 = new jubsokJum();
        jubsokJum1.setGongsa(jubsokParam.getGongsa());
        jubsokJum1.setCableName(jubsokParam.getCableName());
        jubsokJum1.setJubsok(jubsokParam.getJubsok());
        jubsokJum1.setGugan(jubsokParam.getGugan());
        jubsokJum1.setSigong(jubsokParam.getSigong());
        jubsokJum1.setSangwiguk(jubsokParam.getSangwiguk());
        jubsokJum1.setHawiguk(jubsokParam.getHawiguk());
        jubsokJum1.setSulchi(jubsokParam.getSulchi());
        jubsokJum1.setGamri(jubsokParam.getGamri());
        jubsokJum1.setGwanri(jubsokParam.getGwanri());
        jubsokJum1.setCore1(jubsokParam.getCore1());
        jubsokJum1.setCore2(jubsokParam.getCore2());
        jubsokJum1.setCore3(jubsokParam.getCore3());
        jubsokJum1.setCore4(jubsokParam.getCore4());
        jubsokJum1.setCore5(jubsokParam.getCore5());
        jubsokJum1.setCore6(jubsokParam.getCore6());
        jubsokJum1.setCore7(jubsokParam.getCore7());
        jubsokJum1.setCore8(jubsokParam.getCore8());

        System.out.println(jubsokJum1);
        jubsokJum newjubsokJum = jubsokJumRepository1.save(jubsokJum1);
        System.out.println("new : " + newjubsokJum);

        return "ok";
    }
}
