package com.knoldus.validator
import com.knoldus.db.CompanyReadDto
import com.knoldus.models.Company

class CompanyValidator {

  def companyIsValid(company: Company): Boolean = {
    val companyData = new CompanyReadDto()
    for((key,value)<-companyData.companies){
      if(key==company.name)
        return true
    }
    return false
  }
}
