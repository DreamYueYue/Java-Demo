package com.manulife.eTransfer.domain;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Natinality
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-11-06T16:44:34.407+08:00")

public class Natinality   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("nationalityCode")
  private String nationalityCode = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("nationalityEn")
  private String nationalityEn = null;

  @JsonProperty("nationalityChi")
  private String nationalityChi = null;

  @JsonProperty("SortOrder")
  private Integer sortOrder = null;

  public Natinality id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Natinality nationalityCode(String nationalityCode) {
    this.nationalityCode = nationalityCode;
    return this;
  }

  /**
   * Get nationalityCode
   * @return nationalityCode
  **/
  @ApiModelProperty(value = "")


  public String getNationalityCode() {
    return nationalityCode;
  }

  public void setNationalityCode(String nationalityCode) {
    this.nationalityCode = nationalityCode;
  }

  public Natinality name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "doggie", required = true, value = "")
  @NotNull


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Natinality nationalityEn(String nationalityEn) {
    this.nationalityEn = nationalityEn;
    return this;
  }

  /**
   * Get nationalityEn
   * @return nationalityEn
  **/
  @ApiModelProperty(example = "USA", value = "")


  public String getNationalityEn() {
    return nationalityEn;
  }

  public void setNationalityEn(String nationalityEn) {
    this.nationalityEn = nationalityEn;
  }

  public Natinality nationalityChi(String nationalityChi) {
    this.nationalityChi = nationalityChi;
    return this;
  }

  /**
   * Get nationalityChi
   * @return nationalityChi
  **/
  @ApiModelProperty(example = "美國", value = "")


  public String getNationalityChi() {
    return nationalityChi;
  }

  public void setNationalityChi(String nationalityChi) {
    this.nationalityChi = nationalityChi;
  }

  public Natinality sortOrder(Integer sortOrder) {
    this.sortOrder = sortOrder;
    return this;
  }

  /**
   * Get sortOrder
   * @return sortOrder
  **/
  @ApiModelProperty(example = "1", value = "")


  public Integer getSortOrder() {
    return sortOrder;
  }

  public void setSortOrder(Integer sortOrder) {
    this.sortOrder = sortOrder;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Natinality natinality = (Natinality) o;
    return Objects.equals(this.id, natinality.id) &&
        Objects.equals(this.nationalityCode, natinality.nationalityCode) &&
        Objects.equals(this.name, natinality.name) &&
        Objects.equals(this.nationalityEn, natinality.nationalityEn) &&
        Objects.equals(this.nationalityChi, natinality.nationalityChi) &&
        Objects.equals(this.sortOrder, natinality.sortOrder);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, nationalityCode, name, nationalityEn, nationalityChi, sortOrder);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Natinality {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    nationalityCode: ").append(toIndentedString(nationalityCode)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nationalityEn: ").append(toIndentedString(nationalityEn)).append("\n");
    sb.append("    nationalityChi: ").append(toIndentedString(nationalityChi)).append("\n");
    sb.append("    sortOrder: ").append(toIndentedString(sortOrder)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

