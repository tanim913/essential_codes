#include <bits/stdc++.h>
using namespace std;

int main()
{

    int n, m, i, j,k;
    int maximum[10][10], need[10][10], allocation[10][10],valueOfRes[10], available[10];

    cout << "Enter the no of processes : ";
    cin >> n;

    cout << "\n\nEnter the no of resources : ";
    cin >> m;;


    cout << "\n\nEnter the allocation for each process : ";
    for(i = 0; i < n; i++)
    {
        printf("\nFor process %d : ",i + 1);
        for(j = 0; j < m; j++)
        {
            cin >> allocation[i][j];
        }
    }

    printf("\n\nEnter the Max Matrix for each process : ");
    for(i = 0; i < n; i++)
    {
        printf("\nFor process %d : ", i + 1);
        for(j = 0; j < m; j++)
        {
            cin >> maximum[i][j];
        }

    }



    printf("\n\nEnter the value of Resources : ");
    for(i = 0; i < m; i++)
    {
        cin >> valueOfRes[i];
    }

    for (int i = 0; i < m; i++)
    {

        int sum = 0;
        for (int j = 0; j < n; j++)
        {
            sum += allocation[j][i];
        }

        available[i] = valueOfRes[i] - sum;
    }

    for(i = 0; i < n; i++)

    {
        for(j = 0; j < m; j++)
        {
            need[i][j] = maximum[i][j] - allocation[i][j];

        }
    }

    int f[n], ans[n], index = 0;
    for (k = 0; k < n; k++)
    {
        f[k] = 0;
    }

    int y = 0;
    for (k = 0; k < 5; k++)
    {
        for (i = 0; i < n; i++)
        {
            if (f[i] == 0)
            {

                int flag = 0;
                for (j = 0; j < m; j++)
                {
                    if (need[i][j] > available[j])
                    {
                        flag = 1;
                        break;
                    }
                }

                if (flag == 0)
                {
                    ans[index] = i;
                    index++;
                    for (y = 0; y < m; y++)
                        available[y] += allocation[i][y];
                    f[i] = 1;
                }
            }
        }
    }


    if(index == n)
    {

        cout <<"\nThe system is in a safe state!!"<< endl;
        cout << "\nSafe Sequence : < ";
        for( i = 0; i < n; i++)
        {
            cout << "P" <<ans[i]+1 << " ";
        }
        cout  << ">" << endl;
    }
    else
    {
        cout << "\nThe system is in an unsafe state!!";
    }

    return 0;
}

/***
7
3
1 1 1
2 3 3
3 0 5
2 2 0
3 1 0
1 2 1
1 1 1
7 5 6
5 8 5
9 2 8
8 8 6
14 4 5
4 6 3
2 9 2
20 19 16
***/
