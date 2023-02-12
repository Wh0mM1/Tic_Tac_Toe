package com.nihal.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public
class MainActivity extends AppCompatActivity
{
    boolean winnn=false;
    int[] gameState = {2, 2, 2, 2, 2, 2, 2, 2, 2};
    public
    void fade11(View view)
    {
        ImageView O11 = (ImageView)findViewById(R.id.o11);
        o11 = toggle(O11, o11);
    }
    public
    void fade12(View view)
    {
        ImageView O12 = (ImageView)findViewById(R.id.o12);
        o11 = toggle(O12, o11);
    }
    public
    void fade13(View view)
    {
        ImageView O13 = (ImageView)findViewById(R.id.o13);
        o11 = toggle(O13, o11);
    }

    public
    void fade21(View view)
    {
        ImageView O21 = (ImageView)findViewById(R.id.o21);
        o11 = toggle(O21, o11);
    }
    public
    void fade22(View view)
    {
        ImageView O22 = (ImageView)findViewById(R.id.o22);
        o11 = toggle(O22, o11);
    }
    public
    void fade23(View view)
    {
        ImageView O23 = (ImageView)findViewById(R.id.o23);
        o11 = toggle(O23, o11);
    }

    public
    void fade31(View view)
    {
        ImageView O31 = (ImageView)findViewById(R.id.o31);
        o11 = toggle(O31, o11);
    }
    public
    void fade32(View view)
    {
        ImageView O32 = (ImageView)findViewById(R.id.o32);
        o11 = toggle(O32, o11);
    }
    public
    void fade33(View view)
    {
        ImageView O33 = (ImageView)findViewById(R.id.o33);
        o11 = toggle(O33, o11);
    }
    public
    boolean toggle(ImageView XO, boolean check)
    {
        System.out.println(XO.getTag().toString());
        int tappedNum = Integer.parseInt(XO.getTag().toString());
        if (gameState[tappedNum] == 2)
        {
            if (check)
            {
                gameState[tappedNum] = 1;
                System.out.println("True");
                //            XO.animate().alpha(1f);
                XO.setImageResource(R.drawable.o);
            }
            else
            {
                gameState[tappedNum] = 0;
                System.out.println("False");
                XO.setImageResource(R.drawable.x);
            }
        }
        win();

        return !check;
    }
    int num;
    public void win()
    {
        // hori
        if (gameState[0] == gameState[1] && gameState[1] == gameState[2] && (gameState[2] == 1 || gameState[2] == 0))
        {
            System.out.println("wOwwwwr1");
            num=gameState[2];
            winnn=true;
        }
        if (gameState[3] == gameState[4] && gameState[4] == gameState[5] && (gameState[3] == 1 || gameState[3] == 0))
        {
            System.out.println("wOwwwwr2");
            winnn=true;
            num=gameState[3];
        }
        if (gameState[6] == gameState[7] && gameState[7] == gameState[8] && (gameState[6] == 1 || gameState[6] == 0))
        {
            System.out.println("wOwwwwr3");
            winnn=true;
            num=gameState[6];
        }
        // diag
        if (gameState[0] == gameState[4] && gameState[4] == gameState[8] && (gameState[0] == 1 || gameState[0] == 0))
        {
            System.out.println("wOwwwwd1");
            winnn=true;
            num=gameState[0];
        }
        if (gameState[2] == gameState[4] && gameState[4] == gameState[6] && (gameState[2] == 1 || gameState[2] == 0))
        {
            System.out.println("wOwwwwd2");
            winnn=true;
            num=gameState[2];
        }
        // vert
        if (gameState[0] == gameState[3] && gameState[3] == gameState[6] && (gameState[0] == 1 || gameState[0] == 0))
        {
            System.out.println("wOwwwwv1");
            winnn=true;
            num=gameState[0];
        }
        if (gameState[1] == gameState[4] && gameState[4] == gameState[7] && (gameState[1] == 1 || gameState[1] == 0))
        {
            System.out.println("wOwwwwv2");
            winnn=true;
            num=gameState[1];
        }
        if (gameState[2] == gameState[5] && gameState[5] == gameState[8] && (gameState[2] == 1 || gameState[2] == 0))
        {
            System.out.println("wOwwwwv3");
            winnn=true;
            num=gameState[2];
        }

        if(winnn==true)
        {
            String winner="O";
            LinearLayout layout=(LinearLayout) findViewById(R.id.playAgainLayout);
            TextView winnerMessage=(TextView) findViewById(R.id.woncan);
            if(num==0)
            {
                winner="X";
            }
            winnerMessage.setText(winner+" has won!");
            layout.setVisibility(View.VISIBLE);
            System.out.println("layout");
        }
        boolean all=false;
        for(int i=0;i<9;i++)
        {
            if(gameState[i]==2)
            {
                all=true;
                break;
            }
        }
        if(all==false)
        {
            LinearLayout layout=(LinearLayout) findViewById(R.id.playAgainLayout);
            TextView winnerMessage=(TextView) findViewById(R.id.woncan);
            winnerMessage.setText("Boys Played Well!");
            layout.setVisibility(View.VISIBLE);
            Toast.makeText(MainActivity.this,"Draw",Toast.LENGTH_SHORT).show();
            System.out.println("layout");
        }
    }
    public void playAgain( View view)
    {
        LinearLayout layout=(LinearLayout) findViewById(R.id.playAgainLayout);
        layout.setVisibility(View.INVISIBLE);
        //        layout.animate().alpha(0f).setDuration(2000);
        o11 = true;
        winnn=false;
        for(int i=0;i<9;i++)
        {
            gameState[i]=2;
        }

        ImageView O11n=(ImageView) findViewById(R.id.o11);
        O11n.setImageResource(R.drawable.grey);
        ImageView O12n=(ImageView) findViewById(R.id.o12);
        O12n.setImageResource(R.drawable.grey);
        ImageView O13n=(ImageView) findViewById(R.id.o13);
        O13n.setImageResource(R.drawable.grey);

        ImageView O21n=(ImageView) findViewById(R.id.o21);
        O21n.setImageResource(R.drawable.grey);
        ImageView O22n=(ImageView) findViewById(R.id.o22);
        O22n.setImageResource(R.drawable.grey);
        ImageView O23n=(ImageView) findViewById(R.id.o23);
        O23n.setImageResource(R.drawable.grey);

        ImageView O31n=(ImageView) findViewById(R.id.o31);
        O31n.setImageResource(R.drawable.grey);
        ImageView O32n=(ImageView) findViewById(R.id.o32);
        O32n.setImageResource(R.drawable.grey);
        ImageView O33n=(ImageView) findViewById(R.id.o33);
        O33n.setImageResource(R.drawable.grey);
    }



    @Override protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    boolean o11 = true;
}



