---
layout: lab
num: proj01
ready: true
desc:  "Legacy Code Next Steps"
assigned: 2018-02-15 14:00:00.00-7
due: 2018-02-28 23:59:00.00-8
available-projects-link: /info/available_projects/
legacy-code-first-look-lab: proj00
legacy-code-first-look-link: /lab/proj00/
legacy-code-first-look-md-filename: "W18-proj00.md"
last_before: "Midterm E02"
---

proj01 counts towards the first 500 points of the 1000 point needed before the end of the course.

Those points are recorded in Gauchospace under proj1 and proj2, each of which is out of 250 points.

You should complete at least 500 points by the time of the due date listed for {{page.num}}.

# If you are switching pairs or projects

(If you are not switching pairs or projects, skip to the next section: "Open Source Project Next Steps")

If you indicated that you wish to dissolve your pair, and/or keep your pair but move to a new project,
you will need to indicate your preferences about which project you want to switch to.

The available projects are listed here.  Additional projects may become available as/when other
students indicate a preference to switch pairs or projects:

<{{page.available-projects-link}}>

# Open Source Project Next Steps

-   Ensure that you have done a pull request for your {{page.legacy-code-first-look}} repo
    -   This is the one that you did the "code review" steps on.
    -   This is the pull request that should, at a minimum, include a <tt>{{page.legacy-code-first-look-md-filename}}</tt>  file that has the elements indicated in the instructions for [{{page.legacy-code-first-look-lab}}]({{page.legacy-code-first-look-link}})

At that point, what you do next depends on whether you are continuing on the same project, or starting a new one.

-   If you are continuing on the same project, please see the instructions in the "Completing your Open Source Project" section below.

-   If you are switching projects, there are some additional steps you'll need to take first, detailed one this page: [Instructions for Switching Projects](switching/).  After completing those steps, you'll continue with the steps under "Completing your Open Source Project" below.

# Completing Your Open Source Project

To complete your open source project, you need to accumulate 1000 points. You may count up a small number of extra points towards extra credit in the course (see [Syllabus](/info/syllabus/) for details.)

If you are still working on the same repo as in your initial code review, you might have already done some work on various issues.   If so, talk with your mentor about those, and ask your mentor to review your work on those issues.   If you have completed these successfully, and your mentor reviews your code, these can be submitted to the TA/Instructor for grading, and these can count towards your project points for this lab.

If not, then you start now. 

# Make a new branch

Make a new branch called `proj01` as discussed in lecture.

The workflow for making a new branch called `proj01` is:

```
git status
git checkout -b proj01
git push origin proj01
```

When you complete issues, you make a pull request back to the github.com/UCSB-CS56-Projects verison of your repo, from your proj01 branch, and to the master branch.

Make a comment in the pull request: `fixes issue #5` (for example).  The mention of the issue by number, using the `#` symbol, should turn into into an automatic link to the issue.

You should resolve as many issues as you can by due date for this lab (see the calendar). Your goal should be to get as much done as possible by then. Then, check in with your mentor and see what work is left, and how much more you may need to accomplish to earn the 1000 points you need to complete this part of the course.
