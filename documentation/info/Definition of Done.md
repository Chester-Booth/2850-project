# Definition of Done
A story is considered "done" only when ALL of the following is true:

## Code Quality
- Business logic not embedded in server modules
- No obvious duplicated logic
- NO unsafe !! without justification
- Errors handled gracefully, no crashes

### Code Style
- All methods have [Kdoc documentation](https://kotlinlang.org/docs/kotlin-doc.html#external-links)  
- No Ktlint Errors or Warnings
- No Detekt Errors or Warnings

### Testing
- Tests linked to user stories 
    - PR linked to github issue of user story
- Tests linked to acceptance critera
    - Acceptance criteria listed in PR description
    - Tests must map to acceptance critera
- Thorough tests for all code (almost all branches + lines are ran during tests)
- Well-designed implemtation tests that simulate real-world scenarios
- All tests are ran by Actions successfully

## Accessibility
- All UX is accessible first, linked to personas/job stories
- Evidence of screen reader/ keyboard-nav testing
- Contrast at least 4.5:1
- Semantic HTML used and ARIA if not 
- Consistent wording and formatting
- Attention to detail
- Justification of design decisions in `documentation/` 
    - Evidence of UX testing in `UX-tests.md` and changes from it  
    - Screenshots added to `design-changes.md` when appplicable

## Security
- Input validation on all user inputs
- Server-side validation enforced
- authorisation checked where required
- No exposed secrets
- Security-related test cases

## Git Strategy + Integration
- Seprate branches used for development
- PRs used to merge to other branches 
- Projects board used to indicate status
    - Current Status: In Review for PR + User Story
- Detailed PR comments referring to the DoD, explaining how it passes each section
- At least one review, reviewer confirms:
    - Code is understandable
    - It meets the DoD
    - It doesn't break the existing functionality
    - Passes all github actions tests


## Signed by:




