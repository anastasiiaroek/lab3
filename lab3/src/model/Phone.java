package model;

import java.util.*;

public class Phone implements Comparable<Phone> {
   protected String telecoms_provider;
   protected String tel_number;
   protected ArrayList<String> calls_made = new ArrayList();

   public Phone(String tele_p, String tele_n)
   {
       telecoms_provider = tele_p;
       tel_number = tele_n;
   }

   public String getProvider()
   {
       return telecoms_provider;
   }

   public String getNumber()
   {
       return tel_number;
   }

   public void call(String tel_num)
   {
       calls_made.add(tel_num);
   }

   @Override
   public boolean equals(Object o) {
       if (this == o) return true;
       if (!(o instanceof Phone)) return false;
       Phone phone = (Phone) o;
       return Objects.equals(telecoms_provider, phone.telecoms_provider) &&
               Objects.equals(tel_number, phone.tel_number) &&
               Objects.equals(calls_made, phone.calls_made);
   }

   @Override
   public int hashCode() {
       return Objects.hash(telecoms_provider, tel_number, calls_made);
   }

   @Override
   public String toString() {
       return "Phone{" +
               "telecoms_provider='" + telecoms_provider + '\'' +
               ", tel_number='" + tel_number + '\'' +
               ", calls_made=" + calls_made +
               '}';
   }

    @Override
    public int compareTo(Phone a) {
        if (telecoms_provider.length() == a.telecoms_provider.length()) {
            if (tel_number == a.tel_number) {
                if (calls_made == a.calls_made) {
                    return telecoms_provider.compareTo(a.telecoms_provider);
                }
                return 0;
            }
            return tel_number.length() - a.tel_number.length();
        }
        return telecoms_provider.length() - a.telecoms_provider.length();
    }

}