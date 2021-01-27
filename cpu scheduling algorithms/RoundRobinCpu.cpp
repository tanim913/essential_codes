#include <bits/stdc++.h>
using namespace std;

struct process
{
    int pid;
    int burst_time;
    int start_time=0;
    int completion_time;

};

int main()
{

    int n;
    int tq;
    struct process p[100];
    int burst_remaining[100];
    int total  =0;
    int time = 0 ;


    cout << "Enter the number of processes: ";
    cin >> n;
    cout << "Enter time quantum: ";
    cin >> tq;

    for(int i = 0; i < n; i++)
    {
        cout<<"Enter burst time of process "<<i+1<<": ";
        cin >> p[i].burst_time;
        total += p[i].burst_time;
        p[i].pid = i+1;
        cout<<endl;
    }

    cout << "\nProcess\t\tStart-Time\t\tEnd-Time"<< endl;
    while(total!=0)
    {

        for (int i = 0; i<n; i++)
        {
            if(p[i].burst_time > 0)
            {
                int time_req = min(tq,p[i].burst_time);

                p[i].burst_time -= time_req;
                p[i].start_time = time;

                total -= time_req;

                time += time_req;
                p[i].completion_time = time;

                cout <<"P" << p[i].pid << "\t\t" <<p[i].start_time << "\t\t\t" << p[i].completion_time << endl;
        //cout<< "|--P" <<p[i].pid<< "--";
//
//                if(total == 0)
//                {
//                    cout <<"|"<<endl;
//
//                }
            }

        }
    }

    return 0;
}


