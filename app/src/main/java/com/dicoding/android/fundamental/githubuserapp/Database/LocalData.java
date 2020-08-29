package com.dicoding.android.fundamental.githubuserapp.Database;

import com.dicoding.android.fundamental.githubuserapp.R;
import com.dicoding.android.fundamental.githubuserapp.pojo.Pojogithub;

import java.util.ArrayList;

public class LocalData {

    private static int[] photoprofile = {
            R.drawable.ahmad_dahlan,
            R.drawable.ahmad_yani,
            R.drawable.bung_tomo,
            R.drawable.gatot_subroto,
            R.drawable.ki_hadjar_dewantara,
            R.drawable.mohammad_hatta,
            R.drawable.sudirman,
            R.drawable.sukarno,
            R.drawable.supomo,
            R.drawable.tan_malaka
    };

    private static String[] username = {
            "vertix1231",
            "iryd246",
            "irsyad246",
            "eyeshield21",
            "fine_without_dota",
            "sezo",
            "frag",
            "phyme",
            "posf_pyhsics",
            "pascal_cvd_56"
    };
    private static String[] name = {
            "Ahmad Dahlan",
            "Ahmad Yani",
            "Sutomo",
            "Gatot Soebroto",
            "Ki Hadjar Dewantarai",
            "Mohammad Hatta",
            "Soedirman",
            "Soekarno",
            "Soepomo",
            "Tan Malaka"
    };
    private static String[] company = {
            "pt vertix",
            "pt honda",
            "pt ptan",
            "pt petean",
            "pt yamaha",
            "windows",
            "sony",
            "google",
            "yahoo",
            "steam"
    };
    private static String[] location = {
            "bogor",
            "padang",
            "banten",
            "bekasi",
            "cianjur",
            "bukittinggi",
            "bandung",
            "Sukabumi",
            "jogja",
            "surabaya"
    };
    private static String[] repository = {
            "2234",
            "56",
            "132",
            "2000",
            "111",
            "696",
            "969",
            "500",
            "1",
            "1000"
    };
    private static String[] follower = {
            "2234",
            "56",
            "132",
            "2000",
            "111",
            "696",
            "969",
            "500",
            "1",
            "1000"
    };
    private static String[] following = {
            "2234",
            "56",
            "132",
            "2000",
            "111",
            "696",
            "969",
            "500",
            "1",
            "1000"
    };

    public static ArrayList<Pojogithub> getListData() {
        ArrayList<Pojogithub> list = new ArrayList<>();
        for (int position = 0; position < photoprofile.length; position++) {
            Pojogithub dataurut = new Pojogithub();
            dataurut.setIvprofil(photoprofile[position]);
            dataurut.setUsername(username[position]);
            dataurut.setName(name[position]);
            dataurut.setCompany(company[position]);
            dataurut.setLocation(location[position]);
            dataurut.setRepository(repository[position]);
            dataurut.setFollower(follower[position]);
            dataurut.setFollowing(following[position]);
            list.add(dataurut);
        }
        return list;
    }
}
