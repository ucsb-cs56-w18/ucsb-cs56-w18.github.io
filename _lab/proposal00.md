---
layout: lab
num: proposal01
ready: true
desc: "Proposing a new legacy code project (optional)"
assigned: 2018-02-06 12:15:00.00-8
due: 2018-02-08 23:59:00.00-8
---

# Proposing a new legacy code project

Nearly all of the legacy code projects in the <https://github.com/ucsb-cs56-projects> organization 
started as "greenfield code" projects
written by CS56 students.   

In order to keep the pool of legacy code projects fresh, we need to allow a limited 
number of new greenfield projects each year.

We want to be sure that new projects meet a very high standard.  Note that this standard is considerably higher than the standard that was
used for the original pool of legacy code projects&mdash;that's deliberate. We want the pool of projects to constantly be improving in quality.

Here are the current standards that a proposal for new legacy code project must meet:

* It should propose a product that real people will actually want to use.  
   * If it is a game, it should be a game that people will really want to play.
   * If it is a tool, it shoudl be a tool that solves a real problem.
   * It does not necessarily have to be *innovative*&mdash;it can duplicate a game or tool that already exists, but it must be *useful*.
   
* If any existing code is used as a starting point, that code must be unencumbered open source with a clear open source license.

* You must be willing to allow the code you write to be used as a legacy code project in future quarters of CMPSC 56.

* There should be a list of user stories stated in the form: "As a (role) I can (do some thing) so that (some goal is acheived)".   
   * See also: <http://ucsb-cs56-pconrad.github.io/topics/user_stories/>
   * The list needs to have enough user stories in it that your mentor is satisfied that there is sufficient work for you to earn 1000 points by completing those stories, and still have room left to leave something for the next generation of students to work on the project.

* You should convince your mentor and one of the TAs that you have a clear plan of attack for designing the software with good object oriented design.   Your mentor and/or the TA reviewing your proposal may require you to submit some kind of architecture design&mdash;it will be up to them what form that might take.

* You should commit to the following good coding practices:
   * building your project with good test coverage right from the start
   * building your project to use a modern build tool such as Maven or Gradle rather than Ant, and certainly not an ad-hoc process
   * except in the special case of "Android Studio", it may NOT be dependent on a "particular" IDE.  It MUST be IDE independent.   (Again, Android Studio is a special).
   
If you are interested in writing such a proposal, please talk with your mentor or TA before starting.

Note that we will ONLY BE ACCEPTING ONE PROPOSAL per mentor team.  So we may get more good proposals than we are in a position to accept.

# Outline of your proposal

To create a proposal, create a public repo under the ucsb-cs56-f18 organization with the name proposal01_githubid1_githubid2 where githubid1 and githubid2 are the names of you and your pair partner.

In the README.md file for the repo, address the following.    It should be possible to read and understand the entire writeup in 10 minutes time, so provide enough detail that we can follow what you are proposing, but not so much that we can't read and digest it in 10 minutes.

1. One sentence description of the proposed project
2. A paragraph that elaborates on the one sentence description.
3. Any other notes that you think are relevant.

Then, add issues to the repo for enough user stories to constitute 1000 points worth of work.  Use the points assigned to the repo that you reviewed for lab03 as a guide.
