package com.othmane.babysong;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static java.lang.String.valueOf;

public class MainActivity extends AppCompatActivity {
    TextView title;
    GridView grid;


    int[] imgs= new int[]{
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
            R.drawable.yankee_doodle,
            R.drawable.alphabet_song
    };

    int[] songs= new int[]{
            R.raw.are_you_sleeping_brother_john,
            R.raw.baa_baa_black_sheep,
            R.raw.bingo_s,
            R.raw.clap_clap_clap_your_hands,
            R.raw.finger_family,
            R.raw.five_little_monkeys,
            R.raw.happy_birthday,
            R.raw.head_and_shoulders,
            R.raw.hickory_dickory_dock,
            R.raw.hush_little_baby,
            R.raw.i_m_a_little_star,
            R.raw.i_m_a_little_teapot,
            R.raw.if_youre_happy_and_you_know_it,
            R.raw.little_snow_flake,
            R.raw.london_bridge_is_falling_down,
            R.raw.muffin_man,
            R.raw.pat_a_cake,
            R.raw.pretty_little_horses,
            R.raw.rain_rain_go_away,
            R.raw.ring_a_ring_o_roses,
            R.raw.rockabye_baby,
            R.raw.she_ll_be_coming_around_the_mountain,
            R.raw.teddy_bear,
            R.raw.ten_in_the_bed,
            R.raw.twinkle,
            R.raw.wheels_on_the_bus,
            R.raw.yankee_doodle,
            R.raw.alphabet_song
    };
    String[] titles= new String[]{
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
            "Yankee Doodle",
            "ABC (Alphabet Song)"
    };

    String[] lyrics= new String[]{
            "Are you sleeping, are you sleeping?\n Brother John, Brother John?\n Morning bells are ringing, morning bells are ringing\n Ding ding dong, ding ding dong.\n *Repeat Twice",
            "Baa, baa, black sheep, have you any wool?\n Yes sir, yes sir, three bags full!\n One for the master\n One for the dame\n And one for the little boy Who lives down the lane\n *Repeat 3 times",
            "There was a farmer who had a dog\n And Bingo was his name-o.\n B-I-N-G-O\n B-I-N-G-O\n B-I-N-G-O\n And Bingo was his name-o.\n There was a farmer who had a dog\n And Bingo was his name-o.\n (clap)-I-N-G-O\n (clap)-I-N-G-O\n (clap)-I-N-G-O\n And Bingo was his name-o.\n There was a farmer who had a dog\n And Bingo was his name-o.\n (clap)-(clap)-N-G-O\n (clap)-(clap)-N-G-O\n (clap)-(clap)-N-G-O\n And Bingo was his name-o.\n There was a farmer who had a dog\n And Bingo was his name-o.\n (clap)-(clap)-(clap)-G-O\n (clap)-(clap)-(clap)-G-O\n (clap)-(clap)-(clap)-G-O\n And Bingo was his name-o.\n There was a farmer who had a dog\n And Bingo was his name-o.\n (clap)-(clap)-(clap)-(clap)-O\n (clap)-(clap)-(clap)-(clap)-O\n (clap)-(clap)-(clap)-(clap)-O\n And Bingo was his name-o.\n There was a farmer who had a dog\n And Bingo was his name-o.\n (clap)-(clap)-(clap)-(clap)-(clap)\n (clap)-(clap)-(clap)-(clap)-(clap)\n (clap)-(clap)-(clap)-(clap)-(clap)\n And Bingo was his name-o.\n",
            " Clap, clap, clap your hands\n Clap your hands together\n Clap, clap, clap your hands\n Clap your hands together\n Shake, shake, shake your hands\n Shake your hands together\n Shake, shake, shake your hands\n Shake your hands together\n Pound, pound, pound your hands\n Pound your hands together\n Pound, pound, pound your hands\n Pound your hands together\n Roll, roll, roll your hands\n Roll your hands together\n Roll, roll, roll your hands\n Roll your hands together\n Pat, pat, pat your face\n Pat your face together\n Pat, pat, pat your face\n Pat your face together\n",
            " Daddy finger, daddy finger, where are you?\n Here I am, here I am\n How do you do?\n Mommy finger, mommy finger, where are you?\n Here I am, here I am\n How do you do?\n Brother finger, brother finger, where are you?\n Here I am, here I am\n How do you do?\n Sister finger, sister finger, where are you?\n Here I am, here I am\n How do you do?\n Baby finger, baby finger, where are you?\n Here I am, here I am\n How do you do?\n",
            " Five little monkeys jumping on the bed\n One fell off and bumped his head\n Mama called the doctor\n And the doctor said\n No more monkeys jumping on the bedFour little monkeys jumping on the bed\n One fell off and bumped his head\n Mama called the doctor\n And the doctor said, No more monkeys jumping on the bedThree little monkeys jumping on the bed\n One fell off and bumped his head\n Mama called the doctor\n And the doctor said,\n No more monkeys jumping on the bedTwo little monkeys jumping on the bed\n One fell off and bumped his head\n Mama called the doctor\n And the doctor said,\n No more monkeys jumping on the bedOne little monkey jumping on the bed\n One fell off and bumped his head\n Mama called the doctor\n And the doctor said,\n Put those monkeys right to bed\n",
            " Happy Birthday to You\n Happy Birthday to You\n Happy Birthday Happy Birthday\n Happy Birthday to You\n *Repeat",
            " Head and shoulders knees and toes\n Knees and toes\n Head and shoulders knees and toes\n Knees and toes\n Ad eyes and ears\n And mouth and nose\n Head and shoulders knees and toes\n Knees and toes\n *Repeat",
            " Hickory dickory dock\n The mouse ran up the clock\n The clock struck one\n The mouse ran down\n Hickory dickory dock.\n *Repeat",
            " Hush, little baby, don’t say a word.\n Papa’s gonna buy you a mockingbird\n And if that mockingbird won’t sing\n Papa’s gonna buy you a diamond ring\n And if that diamond ring turns brass\n Papa’s gonna buy you a looking glass\n And if that looking glass gets broke\n Papa’s gonna buy you a billy goat\n And if that billy goat won’t pull\n Papa’s gonna buy you a cart and bull\n And if that cart and bull turn over\n Papa’s gonna buy you a dog named Rover\n And if that dog named Rover won’t bark\n Papa’s gonna buy you a horse and cart\n And if that horse and cart fall down\n You’ll still be the sweetest little baby in town.",
            " I’m a little star, hanging on a tree.\n See the little children dance around me.\n CHORUS\n Tra-la-la, tra-la-la\n Tra-la-la, la-la-la\n Tra-la-la, tra-la-la\n Tra-la-la, la\n I’m a candy stick, hanging on a tree.\n See the little children dance around me.\n CHORUS\n I’m a pretty angel, hanging on a tree.\n See the little children dance around me.\n CHORUS\n I’m a bright light, hanging on a tree.\n See the little children dance around me.\n CHORUS",
            " I’m a little teapot\n Short and stouts\n Here is my handle\n Here is my spout\n When I get all steamed up\n Hear me shout\n Just tip me over and pour me out",
            " If you’re happy and you know it, clap your hands (clap clap)\n If you’re happy and you know it, clap your hands (clap clap)\n If you’re happy and you know it, and you really wanna show it\n If you’re happy and you know it, clap your hands. (clap clap)\n If you’re happy and you know it, stomp your feet (stomp stomp)\n If you’re happy and you know it, stomp your feet (stomp stomp)\n If you’re happy and you know it, and you really wanna show it\n If you’re happy and you know it, stomp your feet. (stomp stomp)\n If you’re happy and you know it, snap your fingers (snap snap)\n If you’re happy and you know it, snap your fingers(snap snap)\n If you’re happy and you know it, and you really wanna show it\n If you’re happy and you know it, snap your fingers (snap snap)\n If you’re happy and you know it, shout “Hurray!” (hoo-ray!)\nIf you’re happy and you know it, shout “Hurray!” (hoo-ray!)\n If you’re happy and you know it, and you really wanna show it\n If you’re happy and you know it, shout “Hurray!” (hoo-ray!)\n If you’re happy and you know it, clap your hands (clap clap)\n If you’re happy and you know it, clap your hands (clap clap)\n If you’re happy and you know it, and you really wanna show it\n If you’re happy and you know it, clap your hands. (clap clap)\n If you’re happy and you know it, and you really wanna show it\n If you’re happy and you know it, clap your hands. (clap clap)",
            " Snowflake, snowflake, little snowflake.\n Little snowflake falling from the sky.\n Snowflake, snowflake, little snowflake.\n Falling, falling, falling, falling, falling\n falling, falling, falling, falling…\n falling on my head.\n Snowflake, snowflake, little snowflake.\nLittle snowflake falling from the sky.\n Snowflake, snowflake, little snowflake.\n Falling, falling, falling, falling, falling,\n falling, falling, falling, falling…\n falling on my nose.\n Snowflake, snowflake, little snowflake.\n Little snowflake falling from the sky\n Snowflake, snowflake, little snowflake.\n Falling, falling, falling, falling, falling,\n falling, falling, falling, falling…\n falling in my hand.\n Falling on my head.\n Falling on my nose.\n Falling in my hand.\n Snowflake, snowflake, little snowflake…",
            " London Bridge is falling down\n Falling down, falling down.\n London Bridge is falling down\n My fair lady.\n Build it up with wood and clay\n Wood and clay, wood and clay\n Build it up with wood and clay\n My fair lady.\n Wood and clay will wash away\n Wash away, wash away\n Wood and clay will wash away\n My fair lady.\n Build it up with bricks and mortar\n Bricks and mortar, bricks and mortar\n Build it up with bricks and mortar\n My fair lady.\n Bricks and mortar will not stay\n Will not stay, will not stay\n Bricks and mortar will not stay\n My fair lady.\n Build it up with silver and gold\n Silver and gold, silver and gold\n Build it up with silver and gold\n My fair lady.",
            " Do you know the muffin man\n The muffin man, the muffin man\n Do you know the muffin man\n That lives on Drury Lane?\n Oh, yes, I know the muffin man\n The muffin man, the muffin man\n Yes, I know the muffin man\n That lives on Drury Lane.\n *Repeat",
            " Pat-a-cake, pat-a-cake baker’s man\n Bake me a cake as fast as you can\n Prick it and pat it and mark it with a “b”\n And put it in the oven for Baby and me\n For Baby and me\n For Baby and me\n Put it in the oven for Baby and me\n *Repeat",
            " Hush-a-bye, don't you cry\n Go to sleep you little baby\n When you wake, you will have cake\n And all the pretty little horses\n Blacks and bays, dapples and greys\n A coach and six white horses\n Hush-a-bye, don't you cry\n Go to sleep you little baby\n Way down yonder, down in the meadow\n There's a poor little lamby\n Bees and butterflies flitting 'round his eyes\n He's crying out for his mammy\n Hush-a-bye, don't you cry\n Go to sleep you little baby\n When you wake, you will have cake\n And all the pretty little horses\n Blacks and bays, dapples and greys\n A coach and six white horses\n Blacks and bays, dapples and greys\n All the pretty little horses\n Hush-a-bye, don't you cry\n Go to sleep you little baby\n Go to sleep you little baby\n All the pretty little horses",
            " Rain, rain, go away\n Come again another day\n Daddy wants to play\n Rain, rain go away\n Rain, rain, go away\n Come again another day\n Mommy wants to play\n Rain, rain, go away\n Rain, rain, go away\n Come again another day\n Brother wants to play\n Rain, rain, go away\n Rain, rain, go away\n Come again another day\n Sister wants to play\n Rain, rain, go away\n Rain, Rain, go away\n Come again another day\n Baby wants to play\n Rain, rain, go away\n Rain, Rain, go away\n Come again another day\n All the family wants to play\n Rain, rain, go away",
            " Ring-a-ring o’ roses\n A pocket full of posies\n A-tishoo, a-tishoo!\n We all fall down.\n *Repeat",
            " Rock-a-bye, baby\n In the treetop\n When the wind blows\n The cradle will rock\n When the bough breaks\n The cradle will fall\n And down will come baby (Alt: And mommy will catch you)\n Cradle and all\n Baby is drowsing\n Cosy and fair\n Mother sits near\n In her rocking chair\n Forward and back\n The cradle she swings\n And though baby sleeps\n He hears what she sings\n From the high rooftops\n Down to the sea\n No one's as dear\n As baby to me\n Wee little fingers\n Eyes  wide and bright\n Now sound asleep\n Until morning light",
            " She’ll be coming round the mountain when she comes\n She’ll be coming round the mountain when she comes\n She’ll be coming round the mountain\n She’ll be coming round the mountain\n She’ll be coming round the mountain when she comes.\n She’ll be coming round the mountain when she comes\n She’ll be coming round the mountain when she comes\n She’ll be coming round the mountain\n She’ll be coming round the mountain\n She’ll be coming round the mountain when she comes.\n Singing ‘ay, ay, yippee, yippee ay!’\n Singing ‘ay, ay, yippee, yippee ay!’\n Singing ‘ay, ay, yippee, ay, ay, yippee!’\n Singing ‘ay, ay, yippee, yippee ay!’\n She’ll be riding six white horses when she comes\n She’ll be riding six white horses when she comes\n She’ll be riding six white horses\n She’ll be riding six white horses\n She’ll be riding six white horses when she comes.\n Singing ‘ay, ay, yippee, yippee ay!’\n Singing ‘ay, ay, yippee, yippee ay!’\n Singing ‘ay, ay, yippee, ay, ay, yippee!’\n Singing ‘ay, ay, yippee, yippee ay!’\n Well we’ll all go out to meet her when she comes\n Well we’ll all go out to meet her when she comes\n We’ll all go out to meet her when she comes\n Yes, we’ll all go out to meet her when she comes\n Yes, we’ll all go out to meet her when she comes.\n Singing ‘ay, ay, yippee, yippee ay!’\n Singing ‘ay, ay, yippee, yippee ay!’\n Singing ‘ay, ay, yippee, ay, ay, yippee!’\n Singing ‘ay, ay, yippee, yippee ay!’\n She’ll be wearing silk pyjamas when she comes\n She’ll be wearing silk pyjamas when she comes\n She’ll be wearing pink pyjamas\n She’ll be wearing pink pyjamas\n She’ll be wearing pink pyjamas when she comes.\n Singing ‘ay, ay, yippee, yippee ay!’\n Singing ‘ay, ay, yippee, yippee ay!’\n Singing ‘ay, ay, yippee, ay, ay, yippee!’\n Singing ‘ay, ay, yippee, yippee ay!’\n She’ll be coming round the mountain when she comes\n She’ll be coming round the mountain when she comes\n She’ll be coming round the mountain\n She’ll be coming round the mountain\n She’ll be coming round the mountain when she comes.",
            " Teddy bear, teddy bear, turn around\n Teddy bear, teddy bear, touch the ground\n Teddy bear, teddy bear, reach up high\n Teddy bear, teddy bear, touch the sky\n Teddy bear, teddy bear, take my hand\n Teddy bear, teddy bear, you’re my friend\n Teddy bear, teddy bear, I love you\n Teddy bear, teddy bear, this is true\n Teddy bear, teddy bear, turn off the light\n Everyone says “shhhhh”\n Teddy bear, teddy bear, say goodnight.",
            " There were ten in the bed\n And the little one said,\n“Roll over! Roll over!”\n So they all rolled over and\n one fell out\n There were nine in the bed\nAnd the little one said,\n“Roll over! Roll over!”\n So they all rolled over\n And one fell out\n There were eight in the bed\n And the little one said\n“Roll over! Roll over!”\n So they all rolled over and one fell out\n There were seven in the bed\n And the little one said\n“Roll over! Roll over!”\n So they all rolled over and one fell out\n There were six in the bed\n And the little one said\n“Roll over! Roll over!”\n So they all rolled over and one fell out\n There were five in the bed\n And the little one said\n“Roll over! Roll over!”\n So they all rolled over and one fell out\n There were four in the bed\n And the little one said\n“Roll over! Roll over!”\n So they all rolled over and one fell out\n There were three in the bed\n And the little one said,\n“Roll over! Roll over!”\n So they all rolled over and one fell out\n There were two in the bed\n And the little one said\n“Roll over! Roll over!”\n So they all rolled over and one fell out\n There was one in the bed\nAnd the little one said\n“Good night”",
            " Twinkle, twinkle, little star\n How I wonder what you are.\n Up above the world so high\n Like a diamond in the sky.\n Twinkle, twinkle, little star\n How I wonder what you are.\n When the blazing sun is gone\n When he nothing shines upon\n Then you show your little light\n Twinkle, twinkle, all the night.\n Then the traveler in the dark\n Thanks you for your tiny spark\n He could not see which way to go\n If you did not twinkle so.\n In the dark blue sky you keep\n And often through my curtains peep\n For you never shut your eye\n Till the sun is in the sky.\n As your bright and tiny spark\n Lights the traveler in the dark.\n Though I know not what you are\n Twinkle, twinkle, little star.",
            " The wheels on the bus go round and round\n Round and round, round and round\n The wheels on the bus go round and round\n All through the town\n The doors on the bus go open and shut\n Open and shut, open and shut\n The doors on the bus go open and shut\n All through the town\n The wipers on the bus go swish swish swish\n Swish swish swish, swish swish swish\n The wipers on the bus go swish swish swish\n All through the town\n The baby on the bus goes waa waa waa\n Waa waa waa, waa waa waa\n The baby on the bus goes waa waa waa\n All through the town\n The mommy on the bus goes shhh, shhh, shhh\n Shh shh shh, shh shh shh\n The mommy on the bus goes shhh, shhh, shhh\n All through the town\n The daddy on the bus goes read read read\n Read read read, read read read\n The daddy on the bus goes read read read\n All through the town\n The mommy and the daddy say “I love you\n I love you, I love you”\n The mommy and the daddy say “I love you\n All through the town",
            " Yankee Doodle went to town, a riding on a pony\n Stuck a feather in his cap and called it macaroni\n Yankee Doodle, keep it up, Yankee Doodle dandy\n Mind the music and the step and with the girls be handy\n Father and I went down to camp along with Captain Goodin\nThere we saw the men and boys as thick as hasty puddin’\nYankee Doodle keep it up, Yankee Doodle dandy\nMind the music and the step and with the girls be handy\nThere was Captain Washington upon a slapping stallion\n And all the men and boys around, I guess there was a million\n Yankee Doodle keep it up, Yankee Doodle dandy\n Mind the music and the step and with the girls be handy",
            "A – B – C – D – E – F – G\n H – I – J – K – L – M – N – O – P\n Q – R – S – T – U- V\n W – X – Y and Z\n Now I know my ABC’s\n Next time won’t you sing with me."
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Each row in the list stores country name, currency and flag
        List<HashMap<String,String>> aList = new ArrayList<HashMap<String,String>>();
        for(int i=0;i<imgs.length;i++){
            HashMap<String, String> hm = new HashMap<String,String>();
            hm.put("img", Integer.toString(imgs[i]) );
            hm.put("titles",titles[i]);
            aList.add(hm);
        }
        String[] from = {"titles","img"};
        int[] to = { R.id.titleofMusic,R.id.flag};

        SimpleAdapter adapter = new SimpleAdapter(getBaseContext(),
                aList, R.layout.layout_grid, from, to);
        grid = findViewById(R.id.grid);
        grid.setAdapter(adapter);

        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(getApplicationContext(),SongActivity.class);
                intent.putExtra("title",titles[i]);
                intent.putExtra("lyrics",lyrics[i]);
                intent.putExtra("imgs",imgs[i]);
                intent.putExtra("songs",songs[i]);
                startActivity(intent);

            }
        });


    }
}