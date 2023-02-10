package com.nihal.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public
class MainActivity extends AppCompatActivity
{
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
    public
    void win()
    {
        // hori
        if (gameState[0] == gameState[1] && gameState[1] == gameState[2] && (gameState[2] == 1 || gameState[2] == 0))
        {
            System.out.println("wOwwwwr1");
            Toast.makeText(MainActivity.this, "You Won!", Toast.LENGTH_SHORT).show();
        }
        if (gameState[3] == gameState[4] && gameState[4] == gameState[5] && (gameState[3] == 1 || gameState[3] == 0))
        {
            System.out.println("wOwwwwr2");
            Toast.makeText(MainActivity.this, "You Won!", Toast.LENGTH_SHORT).show();
        }
        if (gameState[6] == gameState[7] && gameState[7] == gameState[8] && (gameState[6] == 1 || gameState[6] == 0))
        {
            System.out.println("wOwwwwr3");
            Toast.makeText(MainActivity.this, "You Won!", Toast.LENGTH_SHORT).show();
        }
        // diag
        if (gameState[0] == gameState[4] && gameState[4] == gameState[8] && (gameState[0] == 1 || gameState[0] == 0))
        {
            System.out.println("wOwwwwd1");
            Toast.makeText(MainActivity.this, "You Won!", Toast.LENGTH_SHORT).show();
        }
        if (gameState[2] == gameState[4] && gameState[4] == gameState[6] && (gameState[2] == 1 || gameState[2] == 0))
        {
            System.out.println("wOwwwwd2");
            Toast.makeText(MainActivity.this, "You Won!", Toast.LENGTH_SHORT).show();
        }
        // vert
        if (gameState[0] == gameState[3] && gameState[3] == gameState[6] && (gameState[0] == 1 || gameState[0] == 0))
        {
            System.out.println("wOwwwwv1");
            Toast.makeText(MainActivity.this, "You Won!", Toast.LENGTH_SHORT).show();
        }
        if (gameState[1] == gameState[4] && gameState[4] == gameState[7] && (gameState[1] == 1 || gameState[1] == 0))
        {
            System.out.println("wOwwwwv2");
            Toast.makeText(MainActivity.this, "You Won!", Toast.LENGTH_SHORT).show();
        }
        if (gameState[2] == gameState[5] && gameState[5] == gameState[8] && (gameState[2] == 1 || gameState[2] == 0))
        {
            System.out.println("wOwwwwv3");
            Toast.makeText(MainActivity.this, "You Won!", Toast.LENGTH_SHORT).show();
        }
    }

    @Override protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    boolean o11 = true;
}



