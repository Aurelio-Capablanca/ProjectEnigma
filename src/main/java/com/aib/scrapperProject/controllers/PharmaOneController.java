package com.aib.scrapperProject.controllers;

import com.aib.scrapperProject.domainLogic.model.GlobalCatalog;
import com.aib.scrapperProject.domainLogic.model.pharmaOneModels.PharmaOneModel;
import com.aib.scrapperProject.domainLogic.services.PharmaOneServices;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class PharmaOneController {

    private final PharmaOneServices services;

    @GetMapping("/SanNicolas/search-term/{term}")
    public ResponseEntity<List<GlobalCatalog>> searchByTermPharmaOne(@PathVariable String term) {
        return new ResponseEntity<>(services.SearchByTerm(term), HttpStatus.OK);
    }

}
