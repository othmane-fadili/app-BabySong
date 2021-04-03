package com.othmane.babysong;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    int[] imgs= new int[]{
            R.drawable.alphabet_song,
            R.drawable.are_you_sleeping_brother_john,
            R.drawable.baa_baa_black_sheep,
            R.drawable.bingo_s,
            R.drawable.clap_clap_clap_your_hands,
            R.drawable.finger_family,
            R.drawable.five_little_monkeys,
            R.drawable.happy_birthday,
            R.drawable.head_and_shoulders,
            R.drawable.hickory_dickory_dock,
            R.drawable.hush_little_baby,
            R.drawable.i_m_a_little_star,
            R.drawable.i_m_a_little_teapot,
            R.drawable.if_youre_happy_and_you_know_it,
            R.drawable.little_snow_flake,
            R.drawable.london_bridge_is_falling_down,
            R.drawable.muffin_man,
            R.drawable.pat_a_cake,
            R.drawable.pretty_little_horses,
            R.drawable.rain_rain_go_away,
            R.drawable.ring_a_ring_o_roses,
            R.drawable.rockabye_baby,
            R.drawable.she_ll_be_coming_around_the_mountain,
            R.drawable.teddy_bear,
            R.drawable.ten_in_the_bed,
            R.drawable.twinkle,
            R.drawable.wheels_on_the_bus,
            R.drawable.yankee_doodle
    };

    String[] titles= new String[]{
            "ABC (Alphabet Song)",
            "Are You Sleeping?",
            "Baa Baa Black Sheep",
            "Bingo - B.I.N.G.O is its name-o",
            "Clap Clap Clap Your hands",
            "Finger Family",
            "Five Little Monkeys",
            "Happy Birthday",
            "Head, Shoulders, Knees & Toes",
            "Hickory Dickory Dock",
            "Hush Little Baby (don't say a word)",
            "I'm a Little Star",
            "I'm a Little Teapot (short and stout)",
            "If You're Happy and You Know It",
            "Little Snowflake",
            "London Bridge is Falling Down",
            "The Muffin Man",
            "Pat a Cake",
            "Pretty Little Horses",
            "Rain Rain Go Away",
            "Ring-a-Ring-O-Roses",
            "Rock-a-Bye, Baby",
            "She'll be Coming Around the Mountain",
            "Teddy Bear Teddy Bear",
            "Ten in the Bed",
            "Twinkle Twinkle Little Star",
            "Wheels on the Bus",
            "Yankee Doodle"
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}