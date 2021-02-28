package com.sn.vhr.model;

import java.util.Date;

public class Salary{

                /**
                * 
                */
                private Integer id;
                /**
                * 基本工资
                */
                private Integer basicsalary;
                /**
                * 奖金
                */
                private Integer bonus;
                /**
                * 午餐补助
                */
                private Integer lunchsalary;
                /**
                * 交通补助
                */
                private Integer trafficsalary;
                /**
                * 应发工资
                */
                private Integer allsalary;
                /**
                * 养老金基数
                */
                private Integer pensionbase;
                /**
                * 医疗基数
                */
                private Integer medicalbase;
                /**
                * 公积金基数
                */
                private Integer accumulationfundbase;
                /**
                * 
                */
                private String name;
                public Integer getId(){
                return id;
                }
                public void setId(Integer id){
                this.id=id;
                }
                public Integer getBasicsalary(){
                return basicsalary;
                }
                public void setBasicsalary(Integer basicsalary){
                this.basicsalary=basicsalary;
                }
                public Integer getBonus(){
                return bonus;
                }
                public void setBonus(Integer bonus){
                this.bonus=bonus;
                }
                public Integer getLunchsalary(){
                return lunchsalary;
                }
                public void setLunchsalary(Integer lunchsalary){
                this.lunchsalary=lunchsalary;
                }
                public Integer getTrafficsalary(){
                return trafficsalary;
                }
                public void setTrafficsalary(Integer trafficsalary){
                this.trafficsalary=trafficsalary;
                }
                public Integer getAllsalary(){
                return allsalary;
                }
                public void setAllsalary(Integer allsalary){
                this.allsalary=allsalary;
                }
                public Integer getPensionbase(){
                return pensionbase;
                }
                public void setPensionbase(Integer pensionbase){
                this.pensionbase=pensionbase;
                }
                public Integer getMedicalbase(){
                return medicalbase;
                }
                public void setMedicalbase(Integer medicalbase){
                this.medicalbase=medicalbase;
                }
                public Integer getAccumulationfundbase(){
                return accumulationfundbase;
                }
                public void setAccumulationfundbase(Integer accumulationfundbase){
                this.accumulationfundbase=accumulationfundbase;
                }
                public String getName(){
                    return name;
                }
                public void setName(String name){
                    this.name=name;
                }
}