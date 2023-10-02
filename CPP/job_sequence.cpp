#include<bits/stdc++.h>
using namespace std;
bool static compare(vector<int> &job1, vector<int> &job2)
{
    return job1[2] > job2[2];
}
vector<int> jobScheduling(vector<vector<int>> &jobs)
{
    
    sort(jobs.begin(), jobs.end(), compare);

    int maxProfit = 0;
    int numberOfJobs = 0;
    int maxDeadline = 0;

    // Find the maximum deadline among all the jobs.
    for (int i = 0; i < jobs.size(); i++)
    {
        maxDeadline = max(maxDeadline, jobs[i][1]);
    }

    // Create a set "slots".
    set<int, greater<int>> slots;

    // Insert all the elements from maxDeadline to 1 into the set.
    for (int i = maxDeadline; i > 0; i--)
    {
        slots.insert(i);
    }
    vector<int> ans;

    for (int i = 0; i < jobs.size(); i++)
    {

        // If the set is empty or the deadline is less than the last element of the set, then ignore this job.
        if (slots.size() == 0 || jobs[i][1] < *slots.rbegin())
        {
            continue;
        }

        int availableSlot = *slots.lower_bound(jobs[i][1]);
        maxProfit = maxProfit + jobs[i][2];
        numberOfJobs += 1;
        slots.erase(availableSlot);
    }

    ans.push_back(numberOfJobs);
    ans.push_back(maxProfit);
    return ans;
}
