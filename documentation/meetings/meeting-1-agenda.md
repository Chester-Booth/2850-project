# Sprint 1 Meeting
> [!TIP]
> - these are points to address/acknowledge
> - [ ] these are descisions to be made

- [x] who minutes this meeting? they should familiarise themselves with template

- overall this is the big meeting to get aligned on everything so we can start developing

- future meetings should only have to cover changes, not the entire thing as today

## Issues to Cover
- Updates (Owner Meeting) 
1. Project Structure
    - review pr
    - tech decisions
2. Meetings
    - standups
    - minutes (who)
    - agenda
    - client meetings
    - retrospectives
3. Project Planning
    - personas
    - user stories (acceptance criteria)
    - wireframes 
    - db structure
    - theming 
4. Sprint 1 
    - decide sprint goal
    - decide sprint end date
    - assign user stories on kanban
    - set milestone (one per sprint)
    - set size/start/end data on issues

- Assign Responsibilities (actions)

---

### Updates

#### Owner Meeting
- Sent email, response TBD

### Project Structure

#### documentation/
acknowledge it includes 
- meeting and retrospective notes
- personas
- job stories
- design and planning documents.
- database diagrams
- class diagram

- [x] write definition of done
- i made a pr for documentation
    - [x] look at its changes
    - [x] add your names to DoD
    - [x] everyone review PR


#### Tech Decisions 
> [!NOTE]
> Ktor, pebble, gradle (ktlint/detekt), sqlite(using exposed), routing, multi module, github actions

- review previously decided tech decisions
    - [x] everyone agreed with all of them?
    - [x] everyones personal weak points?
    - [x] decide on css framework (bootstrap, tailwind, pico.css)
    
> bootstrap 5
- [x] I made a pr with structure, review it now


### Meetings
- ensure everyone knows all the types of meeting and agreed on dates/times/frequency

#### Standups 
- [x] how frequent (minverva says daily)

> daily
- [x] online/off (

> teams chat
- led by weekly revolving role
> chester booth @ ~3pm

#### Weeky Meeting 
- minuted by revolving role
- plan sprint
- [x] when?  

	> ~2:30-3pm Friday`
- [x] online/off 

	> Offline (Laidlaw)`

#### Retrospectives
- [x] how frequent (every sprint?)

> when `2pm Friday`
> Sprint 1 Chester
- different person/style each time
- record outcomes (and how they feed into future retrospectives)

#### Product Owner Meetings
- agenda sent to them beforehand
- minutes after

##### Purpose
- Needs-finding discussion -> use to develop a comprehensive set of user stories to prioritise
- opportunity to discuss project, ask any q's  needed for req's  gathering
- go w/ questions want answering, and breakdown of what you’re planning on doing so that you can work with them to prioritise
##### Planning
- [x] what q's to ask?

> - How should employees acces mgmt system
>	- mobile/desktop?
>	- how to move between them?
>- payment 
>- data sources 
>- APIs, Show other Airlines
>- Price Management (Dynamic Pricing?)
>- Seat Management?
### Project Planning
- [x] requirements gathering (what it means?, how to perform?)
- [x] personas with clear impact on all parts of the system 
    (~4, add more each sprint?)
- [/] job stories (needs)
> [!IMPORTANT]
> clear impact on all parts of the system (add more each sprint?)
>
> When [situation/context],
> I want to [motivation/goal],
> so I can [desired outcome],
> because [underlying need/constraint].

- [/] user stories (implementation tasks)
    (As a [type of user], I want to [action] so that I [value])
    (put in kanban board)
- [x] testing strategy
    - acceptance criteria
        - [x] add to user stories (strategy? only for sprint items?)
        
	        > acceptance criteria on all user stories
	
    - code coverage 
      - [x] use plugin to ensure x % of code is tested for (easy way to ensure criteria) 
    
	      > yes, kover to be used - chester will add to and send PR

      - "near perfect test coverage"
      - (only for logic?)
    - centered on personas/stories
    - [x] UX testing (how?)  
    
	    > Similar to HCI tests, recorded in `UX-tests.md` and changes documented in `design-changes.md`

    - [x] Security testing (how?)
    
       > server side validation and client side too, complete system tests and reverse engineer solutions to validate security
	
    - [x] tests (coverage and integration tests) (discuss?)
    
		> Kover used for code coverage, integration tests done throughout project


- [ ] <i style="font-family:Comic Sans MS; background: linear-gradient(90deg, red, orange, yellow, green, cyan, blue, violet); background-clip: text; color: transparent;">graphic design is my passion</i>
    - [ ] decide colours https://coolors.co 
        - accent colour(s)
        - neutral backgrounds
        - contrast ratios
    - [ ] pick fonts 
        - <span style="font-family: Inter, 'Comic Sans MS';">Inter</span> / <span style="font-family: Roboto, 'Comic Sans MS';">Roboto</span> / <span style="font-family: Noto Sans, 'Comic Sans MS';">Noto Sans</span>
        - <span style="font-family: 'Playfair','Playfair 12pt Light', 'Comic Sans MS';">Playfair </span> / <span style="font-family: 'Playfair Display', 'Comic Sans MS';">Playfair Display</span> / <span style="font-family: 'Roboto Slab', 'Comic Sans MS';">Roboto Slab</span> / <span style="font-family: 'Roboto Serif','Roboto Serif 14pt', 'Comic Sans MS'">Roboto Serif</span>
        - Sans-Serif for body, Distinct heading font
        - multiple weights available
        - i l 1 look different
		- https://fonts.google.com/
    - [ ] icons (Lucide, Fontawesome, Material Design, Bootstrap)
    - [ ] put theming into style.css and variables.css that holds vars for colours and fonts (who? when by?)
> moved to future meeting as not part of MVP and time contraints 

- [x] style guide
    - see https://design-system.service.gov.uk/components/
    - consistent Date format
    - consistent Inputs (submit/confirm)
    - consistent icons (filled vs outline) 
    - consistent spacing
    - consistent font weighting for similar uses
    - [x] how to enforce 
        - continually apppend style-guide.md
        - discuss details as they appear (standups/meetings)
        - double-check for consistency in post easter sprints 

- [/] wireframing UI (paper)
    - Annotated wireframes, encapsulating key design choices (colours/icons)
    - accessible design
    - document changes over time in repo 
    - Significant changes from base library, accessible first design and improved based on personas and job stories
    - [/] someone translates to draw.io file or wiretext.app format 
        (who,when by?)

        > upload images to repo and add notes accordingly

> not fully completed and decided yet, blocked by theming also not being done
> completed in next sprint meeting
> `design/pages.md` file created 


> [!NOTE]
> Incremental changes to designs have been well-reasoned and have evidence chains.
> Full and deep justification of all significant design changes made.



- [/] database structure
    - diagram entities, relationships types and names 
    - [ ] create in draw.io entity relation or dbdiagram.io 
        - [ ] upload to documentation repo (who? when?)
        > chester finalises and uploads by sat 

### Sprint 1
- create MVP?  
    - what is MVP? 
		- function booking system
			- accounts
			- database
			- search for flights
			- input details 
			- book flight 
- [x] decide sprint goal

	> A user can book a flight

- [x] decide sprint end date (week?)

	>  `20/2/26` to `27/2/26`

    - [ ] assign user stories on kanban
        - [ ] give them acceptance criteria
        - [x] set milestone (one per sprint)
        - [ ] set size/start/end date
        - note other info like mark as blocking.
        - create branches from issues (so theyre linked)


### Assign Responsibilities
- go over already assigned responsibilities throughout doc (excl. kanban)
- next meeting 
    - [ ] meeting before product owner meeting? 
    - [x] who books location for next meeting (sprint 2)
    
	    > person who minutes a meeting books the next one

    - [x] who minutes 
    - [x] who is leader for standups
    
	    > for sprint 1, chester
	
    - [ ] who does retrospective (and organise + book room)
    
	    > for sprint 1, chester
	    
    - [ ] when is retrospective?
    
		> 2pm Friday (just before sprint 2 meeting)
		
- [x] update `timeline.md` with meeting and sprint goal (if applic.)
- [ ] other responsibilites to assign?

	>  everyone needs to assign a user story to themselves on github projects board
    > 	 - and add acceptance criteria
    > 	 - set start/target date on issue too
    > 	 - create branch for issue 
    > 	 - start developing 
    > 	 everyone needs to add some more job stories
    > 	 - using ```suggestions like previously 
    >    - job stories need to be clearly linked to personas
 

