---
layout: lab
num: proj02
ready: false
desc:  "Finishing up Legacy Code project"
assigned: 2018-03-01 16:00:00.00-7
due: 2018-03-14 23:59:00.00-8
available-projects-link: /info/available_projects/
legacy-code-first-look-lab: proj00
legacy-code-first-look-link: /lab/proj00/
legacy-code-next-step-lab: proj01
legacy-code-next-step-link: /lab/proj01/
---

{{page.num}} counts towards the last 500 points of the 1000 points needed before the end of the course,
It also offers an opportunity for 100 points of extra credit

Those points are recorded in Gauchospace under proj2a and proj2b, each of which is out of 250 points, 
and projEC, which is out of 100 points.

You should complete at least 500 points by the time of the due date listed for {{page.num}}.  You may also complete up to 100
additional points for extra credit.


# Make a new branch

Make a new branch called `proj02` which is based off of the branch that you did your most recent pull request for.

The workflow for making a new branch called `proj02` based on `proj01` is:

```
git status
git checkout proj01
git checkout -b proj02
git push origin proj02
```

When you complete issues, you make a pull request back to the github.com/UCSB-CS56-Projects 
verison of your repo, from your proj01 branch, and to the master branch.

Make a comment in the pull request: `fixes issue #5` (for example).  
The mention of the issue by number, using the `#` symbol, should turn into into an automatic link to the issue.

