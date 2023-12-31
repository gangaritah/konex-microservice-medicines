package com.konex.drogueria.infrastructure.rest.controller;

import com.konex.drogueria.domain.model.Medicine;
import com.konex.drogueria.application.MedicineService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class MedicineController {
  private MedicineService medicineService;

  @GetMapping("/medicines")
  public ResponseEntity<List<Medicine>> listMedicines(){
    return (ResponseEntity<List<Medicine>>) medicineService.listMedication();
  }

  @GetMapping("/medicines/price/{id}")
  public ResponseEntity<?> priceMedicines(@PathVariable Integer id){
    return (ResponseEntity<List<Medicine>>) medicineService.priceMedication(id);
  }

  @GetMapping("/medicines/name/{id}")
  public ResponseEntity<?> nameMedicines(@PathVariable Integer id){
    return (ResponseEntity<List<Medicine>>) medicineService.nameMedication(id);
  }

  @PostMapping("/medicines")
  public ResponseEntity<?> saveMedicines(@RequestBody Medicine medicine){
    return medicineService.saveMedication(medicine);
  }

  @PutMapping("/medicines/{id}")
  public ResponseEntity<?> updateMedicines(@RequestBody Medicine medicine, @PathVariable Integer id){
    return medicineService.updateMedication(medicine, id);
  }

  @DeleteMapping("/medicines/{id}")
  public ResponseEntity<?> deleteMedicine(@PathVariable Integer id){
    return medicineService.deleteMedication(id);
  }
}
