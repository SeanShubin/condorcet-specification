# Secure Individual Voting Rights System

## Individual Voting Rights
- Your vote was cast
  - Look up your private ballot id on the public list of ballots.
  - If your ballot id is there, your vote was cast.
  - If your ballot id is not there, your vote was not cast.
- Your ballot is accurate
  - Look up your ballot by your private ballot id on the public list of ballots.
  - Compare it to the receipt you took home from the polling place on voting day.
  - If your ballot receipt matches its value on the public list of ballots, your ballot was recorded accurately.
  - If your ballot receipt does not match its value on the public list of ballots, your ballot was not recorded accurately.
- Your ballot was counted correctly
  - Perform the calculations from the public list of ballots yourself.
  - Anyone can download the public list of ballots from the internet.
  - This ensured the public list of ballots can not be altered after publication without everyone knowing about it.
  - Anyone can create and make available software to automate ballot counting. 
- The strength of your ballot was not diluted
  - Check that the number of ballot ids for each jurisdiction matches the number of registered voters in that jurisdiction
  - New ballot ids are generated and made public upon each election and voter registration
  - Duplicate ballot ids indicate voter fraud and need to be discarded and audited
  - Ballot ids that are made public after the election closes are invalid and need to be discarded
  - A quantity of ballot ids from a jurisdiction that exceeds the number of registered voters in that jurisdiction,
    indicates voter fraud systemic to that jurisdiction.
  - None of the ballots from that jurisdiction can be counted until an audit has determined which ballot ids come from registered voters and which do not.
  - Any registered voter can authenticate their ballot is valid by showing their receipt with their ballot id on it to an auditor.
- You were free from coercion
  - There is no public way to connect your ballot to your voter registration, that is, it is a secret ballot election.
- You were able to express your preference completely
  - When a choice between more than 2 outcomes is involved, your vote expresses your complete preference between them
  - This means your first choice, second choice, third choice, and so on, are recorded on your ballot
  - You can also rank outcomes the same if you have no preference between them
  - Outcomes you choose not to rank at all are considered less preferred than any outcomes you do rank
- You were free to vote honestly
  - You can vote your true preference without having to worry about impacting the results against your preferences
  - For example, you should not have to vote for your second choice instead of your first choice,
    because you are afraid not doing so will cause a preference below your second choice to win.

## Mechanics for running an election
- Each jurisdiction will maintain a list of eligible voters
- Only eligible voters registered by the registration deadline will be able to vote in that election 
- As soon as possible after registration deadline
  - Each voter will be sent a unique ballot id for each election
  - All ballot ids will be made public
  - Time between registration deadline and polls opening must allow time for this 
- Ballot ids are unique across the entire election, the same ballot id can not be used in different jurisdictions
- Ballot ids are not re-used between elections, a new set is generated each time
- At the polling place, each voter will have access to a device that
  - allows them review and make changes to their selections, or reset their ballot and start again
  - prints out their final ballot with their selections filled in so that they may verify it is correct and sign it
  - allows them to re-print the ballot if necessary
  - upon finalizing their ballot, gives them a receipt with their name, address, ballot id, and selections
- The voter takes their receipt, and leaves their ballot at the polling place
- Voter selections may be made online before and during election day, but ballots can only be created and authenticated at a polling place
- Technology failures can be overcome by manually writing in the ballot id and selections on a blank ballot
- Once polling closes
  - Poll workers manually count the number of ballots, this number will be published
  - Poll workers will not have access to the count of ballots recorded by the software
  - In this way, the magnitude of discrepancies will be made known to the public 
  - Poll workers will match ballot selections to the corresponding ballot ids in the software
  - In this way, physical, signed ballots are preserved for future audits
- After the election ends
  - voters can download the entire set of ballots to validate their vote in particular and the election as a whole
