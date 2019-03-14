/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai7;

import java.util.Scanner;

/**
 *
 * @author Pc Of Huy Toan
 */
public class MyDate {

    private int date;
    private int month;
    private int year;

    public MyDate() {
    }

    public MyDate(int date, int month, int year) {
        this.date = date;
        this.month = month;
        this.year = year;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void inputInfo() {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập ngày : ");
        date = input.nextInt();
        System.out.println("Nhập Tháng : ");
        month = input.nextInt();
        System.out.println("Nhập năm : ");
        year = input.nextInt();
    }

    public void shortType() {
        System.out.println("Dạng ngắn : " + date + "/" + month + "/" + year);
    }

    public void longType() {
        System.out.println("Dạng dài : Ngày " + date + " Tháng " + month + " Năm " + year);
    }
    public void minusDate(int date){
        int total = Math.abs(this.date - date);
        int countYear = 0;
        if ((this.year % 4 == 0 && this.year % 100 != 0) || (this.year % 400 == 0)) {
            if (this.month == 1 || this.month == 3 || this.month == 5 || this.month == 7 || this.month == 8 || this.month == 10 || this.month == 12) {
                if(total>31){
                while (total > 31) {
                    if (this.month > 12) {
                        setMonth(1);
                        this.year++;
                    } else if (this.month == 1 || this.month == 3 || this.month == 5 || this.month == 7 || this.month == 8 || this.month == 10 || this.month == 12) {
                        total = total - 31;
                        this.month++;
                    } else if (this.month == 4 || this.month == 6 || this.month == 9 || this.month == 11) {
                        total = total - 30;
                        this.month++;
                    } else if (this.month == 2) {
                        total = total - 29;
                        this.month++;
                    }
                }
                this.date = total;
                }
                else this.date=this.date-date;
            }
            else if(this.month == 4 || this.month == 6 || this.month == 9 || this.month == 11){
                if(total>30){
                while (total > 30) {
                    if (this.month > 12) {
                        setMonth(1);
                        this.year++;
                    } else if (this.month == 1 || this.month == 3 || this.month == 5 || this.month == 7 || this.month == 8 || this.month == 10 || this.month == 12) {
                        total = total - 31;
                        this.month++;
                    } else if (this.month == 4 || this.month == 6 || this.month == 9 || this.month == 11) {
                        total = total - 30;
                        this.month++;
                    } else if (this.month == 2) {
                        total = total - 29;
                        this.month++;
                    }
                }
                this.date = total;}
                else this.date=this.date-date;
            }
            else if(this.month==2){
                if(total>29){
                while (total > 30) {
                    if (this.month > 12) {
                        setMonth(1);
                        this.year++;
                    } else if (this.month == 1 || this.month == 3 || this.month == 5 || this.month == 7 || this.month == 8 || this.month == 10 || this.month == 12) {
                        total = total - 31;
                        this.month++;
                    } else if (this.month == 4 || this.month == 6 || this.month == 9 || this.month == 11) {
                        total = total - 30;
                        this.month++;
                    } else if (this.month == 2) {
                        total = total - 29;
                        this.month++;
                    }
                }
                this.date = total;}
                else this.date=this.date-date;
            }
        } 
        else{
            if (this.month == 1 || this.month == 3 || this.month == 5 || this.month == 7 || this.month == 8 || this.month == 10 || this.month == 12) {
                if(total>31){
                while (total > 31) {
                    if (this.month > 12) {
                        setMonth(1);
                        this.year++;
                    } else if (this.month == 1 || this.month == 3 || this.month == 5 || this.month == 7 || this.month == 8 || this.month == 10 || this.month == 12) {
                        total = total - 31;
                        this.month++;
                    } else if (this.month == 4 || this.month == 6 || this.month == 9 || this.month == 11) {
                        total = total - 30;
                        this.month++;
                    } else if (this.month == 2) {
                        total = total - 28;
                        this.month++;
                    }
                }
                this.date = total;
                }
                else this.date=this.date-date;
            }
            else if(this.month == 4 || this.month == 6 || this.month == 9 || this.month == 11){
                if(total>30){
                while (total > 30) {
                    if (this.month > 12) {
                        setMonth(1);
                        this.year++;
                    } else if (this.month == 1 || this.month == 3 || this.month == 5 || this.month == 7 || this.month == 8 || this.month == 10 || this.month == 12) {
                        total = total - 31;
                        this.month++;
                    } else if (this.month == 4 || this.month == 6 || this.month == 9 || this.month == 11) {
                        total = total - 30;
                        this.month++;
                    } else if (this.month == 2) {
                        total = total - 28;
                        this.month++;
                    }
                }
                this.date = total;}
                else this.date=this.date-date;
            }
            else if(this.month==2){
                if(total>28){
                while (total > 30) {
                    if (this.month > 12) {
                        setMonth(1);
                        this.year++;
                    } else if (this.month == 1 || this.month == 3 || this.month == 5 || this.month == 7 || this.month == 8 || this.month == 10 || this.month == 12) {
                        total = total - 31;
                        this.month++;
                    } else if (this.month == 4 || this.month == 6 || this.month == 9 || this.month == 11) {
                        total = total - 30;
                        this.month++;
                    } else if (this.month == 2) {
                        total = total - 28;
                        this.month++;
                    }
                }
                this.date = total;}
                else this.date=this.date-date;
            }
        
        }
        shortType();
    }
    public void minusYear(int year){
        System.out.println("|"+year+" - "+this.year+"| = "+Math.abs(this.year-year));
   }
    public void minusMonth(int month){
       int minus=Math.abs(this.month-month);
       int count = 0;
        if (month + this.month > 12) {
            while (minus > 12) {
                minus = minus - 12;
                count++;
            }
            this.month = minus;
            this.year = this.year + count;
        } else {
            this.month = month + this.month;
        }
        shortType();

    }

    public void totalDate(int date) {
        int total = this.date + date;
        int countYear = 0;
        if ((this.year % 4 == 0 && this.year % 100 != 0) || (this.year % 400 == 0)) {
            if (this.month == 1 || this.month == 3 || this.month == 5 || this.month == 7 || this.month == 8 || this.month == 10 || this.month == 12) {
                if(total>31){
                while (total > 31) {
                    if (this.month > 12) {
                        setMonth(1);
                        this.year++;
                    } else if (this.month == 1 || this.month == 3 || this.month == 5 || this.month == 7 || this.month == 8 || this.month == 10 || this.month == 12) {
                        total = total - 31;
                        this.month++;
                    } else if (this.month == 4 || this.month == 6 || this.month == 9 || this.month == 11) {
                        total = total - 30;
                        this.month++;
                    } else if (this.month == 2) {
                        total = total - 29;
                        this.month++;
                    }
                }
                this.date = total;
                }
                else this.date=this.date+date;
            }
            else if(this.month == 4 || this.month == 6 || this.month == 9 || this.month == 11){
                if(total>30){
                while (total > 30) {
                    if (this.month > 12) {
                        setMonth(1);
                        this.year++;
                    } else if (this.month == 1 || this.month == 3 || this.month == 5 || this.month == 7 || this.month == 8 || this.month == 10 || this.month == 12) {
                        total = total - 31;
                        this.month++;
                    } else if (this.month == 4 || this.month == 6 || this.month == 9 || this.month == 11) {
                        total = total - 30;
                        this.month++;
                    } else if (this.month == 2) {
                        total = total - 29;
                        this.month++;
                    }
                }
                this.date = total;}
                else this.date=this.date+date;
            }
            else if(this.month==2){
                if(total>29){
                while (total > 30) {
                    if (this.month > 12) {
                        setMonth(1);
                        this.year++;
                    } else if (this.month == 1 || this.month == 3 || this.month == 5 || this.month == 7 || this.month == 8 || this.month == 10 || this.month == 12) {
                        total = total - 31;
                        this.month++;
                    } else if (this.month == 4 || this.month == 6 || this.month == 9 || this.month == 11) {
                        total = total - 30;
                        this.month++;
                    } else if (this.month == 2) {
                        total = total - 29;
                        this.month++;
                    }
                }
                this.date = total;}
                else this.date=this.date+date;
            }
        } 
        else{
            if (this.month == 1 || this.month == 3 || this.month == 5 || this.month == 7 || this.month == 8 || this.month == 10 || this.month == 12) {
                if(total>31){
                while (total > 31) {
                    if (this.month > 12) {
                        setMonth(1);
                        this.year++;
                    } else if (this.month == 1 || this.month == 3 || this.month == 5 || this.month == 7 || this.month == 8 || this.month == 10 || this.month == 12) {
                        total = total - 31;
                        this.month++;
                    } else if (this.month == 4 || this.month == 6 || this.month == 9 || this.month == 11) {
                        total = total - 30;
                        this.month++;
                    } else if (this.month == 2) {
                        total = total - 28;
                        this.month++;
                    }
                }
                this.date = total;
                }
                else this.date=this.date+date;
            }
            else if(this.month == 4 || this.month == 6 || this.month == 9 || this.month == 11){
                if(total>30){
                while (total > 30) {
                    if (this.month > 12) {
                        setMonth(1);
                        this.year++;
                    } else if (this.month == 1 || this.month == 3 || this.month == 5 || this.month == 7 || this.month == 8 || this.month == 10 || this.month == 12) {
                        total = total - 31;
                        this.month++;
                    } else if (this.month == 4 || this.month == 6 || this.month == 9 || this.month == 11) {
                        total = total - 30;
                        this.month++;
                    } else if (this.month == 2) {
                        total = total - 28;
                        this.month++;
                    }
                }
                this.date = total;}
                else this.date=this.date+date;
            }
            else if(this.month==2){
                if(total>28){
                while (total > 30) {
                    if (this.month > 12) {
                        setMonth(1);
                        this.year++;
                    } else if (this.month == 1 || this.month == 3 || this.month == 5 || this.month == 7 || this.month == 8 || this.month == 10 || this.month == 12) {
                        total = total - 31;
                        this.month++;
                    } else if (this.month == 4 || this.month == 6 || this.month == 9 || this.month == 11) {
                        total = total - 30;
                        this.month++;
                    } else if (this.month == 2) {
                        total = total - 28;
                        this.month++;
                    }
                }
                this.date = total;}
                else this.date=this.date+date;
            }
        
        }
        shortType();
    }

    public void totalYear(int year) {
        this.year = year + this.year;
        shortType();
    }

    public void totalMonth(int month) {
        int count = 0;
        int minus = month + this.month;

        if (month + this.month > 12) {
            while (minus > 12) {
                minus = minus - 12;
                count++;
            }
            this.month = minus;
            this.year = this.year + count;
        } else {
            this.month = month + this.month;
        }
        shortType();

    }

    public void compare(int date1, int month1, int year1) {
        if (date == date1 && month1 == month && year1 == year) {
            System.out.println("Ngày tháng năm bằng nhau");
        } else {
            System.out.println("Ngày tháng năm khác nhau");
        }
    }

    public void animal() {
        int year1 = year / 100;//lấy 2 số trc
        int year2 = year % 100;//lấy 2 số sau
        int year3 = year % 10;//lấy số cuối
        switch (year3) {
            case 0:
                System.out.printf("Năm này là năm Canh ");
                break;
            case 1:
                System.out.printf("Năm này là năm Tân ");
                break;
            case 2:
                System.out.printf("Năm này là năm Nhâm ");
                break;
            case 3:
                System.out.printf("Năm này là năm Quý ");
                break;
            case 4:
                System.out.printf("Năm này là năm Giáp ");
                break;
            case 5:
                System.out.printf("Năm này là năm Ất ");
                break;
            case 6:
                System.out.printf("Năm này là năm Bính ");
                break;
            case 7:
                System.out.printf("Năm này là năm Đinh ");
                break;
            case 8:
                System.out.printf("Năm này là năm Mậu ");
                break;
            case 9:
                System.out.printf("Năm này là năm Kỷ ");
                break;

        }
        if (year1 % 3 == 1) {
            switch (year2 % 12) {
                case 0:
                    System.out.printf("Tý");
                    break;
                case 1:
                    System.out.printf("Sửu");
                    break;
                case 2:
                    System.out.printf("Dần");
                    break;
                    case 3:
                    System.out.printf("Mão");
                    break;
                    case 4:
                    System.out.printf("Thìn");
                    break;
                    case 5:
                    System.out.printf("Tỵ");
                    break;
                    case 6:
                    System.out.printf("Ngọ");
                    break;
                    case 7:
                    System.out.printf("Mùi");
                    break;
                    case 8:
                    System.out.printf("Thân");
                    break;
                    case 9:
                    System.out.printf("Dậu");
                    break;
                    case 10:
                    System.out.printf("Tuất");
                    break;
                    case 11:
                    System.out.printf("Hợi");
                    break;
                    
            }
        }
        else if (year1 % 3 == 0) {
            switch (year2 % 12) {
                case 0:
                    System.out.printf("Thân");
                    break;
                case 1:
                    System.out.printf("Dậu");
                    break;
                case 2:
                    System.out.printf("Tuất");
                    break;
                    case 3:
                    System.out.printf("Hợi");
                    break;
                    case 4:
                    System.out.printf("Tý");
                    break;
                    case 5:
                    System.out.printf("Sửu");
                    break;
                    case 6:
                    System.out.printf("Dần");
                    break;
                    case 7:
                    System.out.printf("Mão");
                    break;
                    case 8:
                    System.out.printf("Thìn");
                    break;
                    case 9:
                    System.out.printf("Tỵ");
                    break;
                    case 10:
                    System.out.printf("Ngọ");
                    break;
                    case 11:
                    System.out.printf("Mùi");
                    break;
                    
            }
        }
        else if (year1 % 3 == 2) {
            switch (year2 % 12) {
                case 0:
                    System.out.printf("Thìn");
                    break;
                case 1:
                    System.out.printf("tỵ");
                    break;
                case 2:
                    System.out.printf("Ngọ");
                    break;
                    case 3:
                    System.out.printf("Mùi");
                    break;
                    case 4:
                    System.out.printf("Thân");
                    break;
                    case 5:
                    System.out.printf("Dậu");
                    break;
                    case 6:
                    System.out.printf("Tuất");
                    break;
                    case 7:
                    System.out.printf("Hợi");
                    break;
                    case 8:
                    System.out.printf("Tý");
                    break;
                    case 9:
                    System.out.printf("Sửu");
                    break;
                    case 10:
                    System.out.printf("Dần");
                    break;
                    case 11:
                    System.out.printf("Mão");
                    break;
                    
            }
        }
    }
}
