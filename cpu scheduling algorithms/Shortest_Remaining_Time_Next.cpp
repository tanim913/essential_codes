#include <bits/stdc++.h>

# define max1 10      //MAX PROCESSES
# define r 6          //MAX RESOURCES

using namespace std;

void sort(int st,int a[],int b[],int pr[],int process)
{
    int i,j,t,p,z;
    for(i=0; i<process-1; i++)
    {
        for(j=st; j<process-i-1; j++)
        {
            if(a[j]>a[j+1])
            {
                t=a[j];
                z=b[j];
                p=pr[j];
                a[j]=a[j+1];
                b[j]=b[j+1];
                pr[j]=pr[j+1];
                a[j+1]=t;
                b[j+1]=z;
                pr[j+1]=p;
            }
        }
    }
}


void srtn()
{
    int process_number[max1],burst_time[max1],i,ch,process;
    int arrival_time[max1];
    int turnaround_time[max1];
    int waiting_time[max1];
    int resp[max1];
    int process_gantt_chart[max1];
    int time_gantt_chart[max1];
    int total_burst_time=0;
    int j,k,count,c,a;
    int time_remaining[max1];
    printf("\nEnter no. of processes  : ");
    scanf("%d",&process);
    for(i=0; i<process; i++)
    {
        printf("\nEnter the Process  : %d",i+1);
        process_number[i]=i;
        printf("\nExecution time : ");
        scanf("%d",&burst_time[i]);
        printf("\nArrival time   : ");
        scanf("%d",&arrival_time[i]);
    }
    printf("\nPROCESSES\t\tEXECUTION TIME\t\tARRIVAL TIME");
    for(i=0; i<process; i++)
    {
        printf("\n P%d  \t\t\t %d  \t\t\t %d",process_number[i]+1,burst_time[i],arrival_time[i]);
    }
    for(i=0; i<process; i++)
    {
        total_burst_time=total_burst_time+burst_time[i];
        time_remaining[i]=burst_time[i];
    }
    sort(0,arrival_time,process_number,burst_time,process);
    time_gantt_chart[0]=0;
    j=0,k=0,count=0,c=0;
    while(count!=total_burst_time)
    {
        if(j!=process)
        {
            j=k;
            for(i=k; i<process; i++)
            {
                if(arrival_time[i]<=count)
                    j++;
                else
                    break;
            }
            if((j-k)>1)
                sort(k,time_remaining,process_number,arrival_time,j);
        }
        while(time_remaining[k]==0)
            k++;
        c++;
        process_gantt_chart[c-1]=process_number[k];
        if(j==process)
            a=time_remaining[k];
        else
        {
            if(time_remaining[k] < (arrival_time[j]-time_gantt_chart[c-1]) )
                a=time_remaining[k];
            else
                a=arrival_time[j]-time_gantt_chart[c-1];
        }
        time_gantt_chart[c]=time_gantt_chart[c-1]+a;
        count=time_gantt_chart[c];
        time_remaining[k]=time_remaining[k]-(time_gantt_chart[c]-time_gantt_chart[c-1]);
        if(c>1)
        {
            if(process_gantt_chart[c-1]==process_gantt_chart[c-2])
            {
                time_gantt_chart[c-1]=time_gantt_chart[c];
                c--;
            }
        }
    }
    sort(0,arrival_time,process_number,time_remaining,process);

    printf("\n\nGANTT CHART: ");
    printf("\n");
    for(i=0; i<c; i++)
        printf("    P%d  ",process_gantt_chart[i]+1);

    printf("\n");


    for(i=0; i<=c; i++)
        printf("   %d   ",time_gantt_chart[i]);
}

int main()
{
    srtn();
    return 0;
}
