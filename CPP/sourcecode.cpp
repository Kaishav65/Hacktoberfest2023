#include <iostream>
#include <vector>
#include <string>
#include <algorithm>

using namespace std;

// Function to generate all legal subsets
void generateSubsets(vector<string>& input, vector<string>& subset, vector<vector<string>>& subsets, size_t index) {
    if (index == input.size()) {
        subsets.push_back(subset);
        return;
    }

    // Exclude the current string
    generateSubsets(input, subset, subsets, index + 1);

    // Include the current string
    subset.push_back(input[index]);
    generateSubsets(input, subset, subsets, index + 1);
    subset.pop_back();
}

int main() {
    int N;
    long long R; // Use long long for R
    cin >> N >> R;
    cin.ignore(); // Ignore the newline character

    string inputStr;
    getline(cin, inputStr);

    vector<string> input;
    size_t pos = 0;
    while ((pos = inputStr.find(',')) != string::npos) {
        string token = inputStr.substr(0, pos);
        input.push_back(token);
        inputStr.erase(0, pos + 1);
    }
    input.push_back(inputStr);

    vector<string> subset;
    vector<vector<string>> subsets;

    generateSubsets(input, subset, subsets, 0);

    // Sort subsets based on size and string order
    sort(subsets.begin(), subsets.end(), [&](const vector<string>& a, const vector<string>& b) {
        if (a.size() != b.size()) {
            return a.size() < b.size();
        } else {
            for (size_t i = 0; i < a.size(); ++i) {
                if (a[i] != b[i]) {
                    return find(input.begin(), input.end(), a[i]) < find(input.begin(), input.end(), b[i]);
                }
            }
            return false;
        }
    });

    // Check if R is within a valid range
    if (R >= 1 && R <= subsets.size()) {
        // Output the Rth subset
        vector<string> result = subsets[R - 1];
        for (size_t i = 0; i < result.size(); ++i) {
            cout << result[i];
            if (i < result.size() - 1) {
                cout << ",";
            }
        }
        cout << endl;
    } else {
        cout << "Invalid rank." << endl;
    }

    return 0;
}
