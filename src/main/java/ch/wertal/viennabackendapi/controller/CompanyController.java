package ch.wertal.viennabackendapi.controller;

import ch.wertal.viennabackendapi.mocks.TestData;
import ch.wertal.viennabackendapi.models.Client;
import ch.wertal.viennabackendapi.models.Company;
import ch.wertal.viennabackendapi.services.repos.ClientRepository;
import ch.wertal.viennabackendapi.services.repos.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;


@RestController
@RequestMapping("/companies")
public class CompanyController {


    private  CompanyRepository companyRepository ;

    public CompanyController(CompanyRepository companyRepository)
    {
        this.companyRepository = companyRepository;
    }



    @GetMapping
    public List<Company> getCompanies() {

        return companyRepository.findAll();
    }

    @GetMapping("/demo")
    public List<Client> getDemoClients() {
        return TestData.getTestClients() ;
    }

    @GetMapping("/{id}")
    public Company getCompany(@PathVariable Long id) {
        return companyRepository.findById(id).orElseThrow(RuntimeException::new);
    }

    @PostMapping
    public ResponseEntity createCompany(@RequestBody Company company) throws URISyntaxException {
        Company savedCompany = companyRepository.save(company);
        return ResponseEntity.created(new URI("/companies/" + savedCompany.getId())).body(savedCompany);
    }

    @PutMapping("/{id}")
    public ResponseEntity updateCompany(@PathVariable Long id, @RequestBody Company company) {
        Company currentCompany = companyRepository.findById(id).orElseThrow(RuntimeException::new);
        currentCompany.setCompanyName(company.getCompanyName());
        currentCompany.setEmail(company.getEmail());
        currentCompany = companyRepository.save(company);

        return ResponseEntity.ok(currentCompany);
    }


}
