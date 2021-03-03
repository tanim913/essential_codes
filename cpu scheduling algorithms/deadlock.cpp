#include<bits/stdc++.h>
using namespace std;
const int maxN =  100000;
vector<int> v[maxN];
int color[maxN],par[maxN];
bool cycle = 0;
string str[maxN],e1,e2;


void get_path(int cur,int target)
{
    if(cur==target)
    {
        cout<<str[cur]<<" ";
        return;
    }
    get_path(par[cur],target);
    cout<<str[cur]<<" ";
}
void dfs(int node)
{
    color[node]  = 1;
    for(int i=0; i<v[node].size(); i++)
    {
        if(color[v[node][i]]==0)
        {
            par[v[node][i]]  =node;
            dfs(v[node][i]);
        }
        else if(color[v[node][i]]==1)
        {
            cycle = 1;
            cout<<"Deadlock Detected Among nodes: ";
            get_path(node,v[node][i]);
            cout<<endl;
        }
    }
    color[node]  = 2;
}
int main()
{
    int n,m;
    cout<<"Enter number of nodes : ";
    cin>>n;
    cout<<"Node Names : ";
    map<string,int> compress;
    for(int i=1; i<=n; i++)
    {
        cin>>str[i];
        compress[str[i]]  = i;
    }
    cout<<"Enter number of edges : ";
    cin>>m;
    cout<<"Edges :"<<endl;
    while(m--)
    {
        cin>>e1>>e2;
        v[compress[e1]].push_back(compress[e2]);
    }
    for(int i=1; i<=n; i++)
    {
        if(color[i]==0)
        {
            par[i]  = i;
            dfs(i);
        }
    }
    if(!cycle)
    {
        cout<<"No Cycle Detected"<<endl;
    }
    return 0;
}
/***
13
R A C S D T B E F U V W G
13
R A
A S
C S
W F
F S
D S
U D
G U
V G
E V
D T
B T
T E


***/
