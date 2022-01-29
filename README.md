# Secure Individual Voting Rights System

## Individual Voting Rights
- You have the right to personally verify that your vote was cast or not according to your choice
- You have the right to personally verify that your vote is accurate
- You have the right to personally verify that your vote was tallied correctly
- You have the right to be free from coercion in how you vote  This right is secured by implementing secret ballot
- Limited only by the constraints necessarily imposed by secret ballot, you have the right to be maximally assured that your vote was not diluted by illegitimate votes
- You have the right to express your preferences completely, by ranking all choices in your preferred order 
- You have the right to vote honestly, without having to choose the lessor of two evils for fear your honest vote will work against you  This right is secured by implementing the condorcet criterion 

## Individual Voting Rights in Detail
- You have the right to personally verify that your vote was cast or not according to your choice
  - Look up your private ballot id on the public list of ballots
  - If your ballot id is there, your vote was cast
  - If your ballot id is not there, your vote was not cast
- You have the right to personally verify that your vote is accurate
  - Look up your ballot by your private ballot id on the public list of ballots
  - Compare it to the receipt you took home from the polling place on voting day
  - If your ballot receipt matches its value on the public list of ballots, your ballot was recorded accurately
  - If your ballot receipt does not match its value on the public list of ballots, your ballot was not recorded accurately
- You have the right to personally verify that your vote was tallied correctly
  - Perform the calculations from the public list of ballots yourself
  - Anyone can download the public list of ballots from the internet
  - This ensured the public list of ballots can not be altered after publication without everyone knowing about it
  - Anyone can create and make available software to automate ballot counting 
- You have the right to be free from coercion in how you vote, guaranteed by secret ballot
  - There is no public way to connect your ballot to your voter registration, that is, it is a secret ballot election
- Limited only by the constraints necessarily imposed by secret ballot, you have the right to be maximally assured that your vote was not diluted by illegitimate votes
  - Check that the number of ballot ids for each jurisdiction matches the number of registered voters in that jurisdiction
  - New ballot ids are generated and made public upon each election and voter registration
  - Duplicate ballot ids indicate voter fraud and need to be discarded and audited
  - Ballot ids that are made public after the election closes are invalid and need to be discarded
  - A quantity of ballot ids from a jurisdiction that exceeds the number of registered voters in that jurisdiction,
    indicates voter fraud systemic to that jurisdiction
  - None of the ballots from that jurisdiction can be counted until an audit has determined which ballot ids come from registered voters and which do not
  - Any registered voter can authenticate their ballot is valid by showing their receipt with their ballot id on it to an auditor
- You have the right to express your preferences completely, by ranking all choices in your preferred order
  - When a choice between more than 2 outcomes is involved, your vote expresses your complete preference between them
  - This means your first choice, second choice, third choice, and so on, are recorded on your ballot
  - You can also rank outcomes the same if you have no preference between them
  - Outcomes you choose not to rank at all are considered less preferred than any outcomes you do rank
- You have the right to vote honestly, without having to choose the lessor of two evils for fear your honest vote will work against you
  - You can vote your true preference without having to worry about impacting the results against your preferences
  - For example, you should not have to vote for your second choice instead of your first choice,
    because you are afraid not doing so will cause a preference below your second choice to win

## One possible implementation of these voting rights
- Each district maintains a registry of voters
  - Adds new voters to the registry as they become eligible to vote
  - Removes voters from the registry as they become ineligible to vote
- Begin voter registration certification for the next election
  - Send out voter information packet and unique ballot id to each registered voter
  - Ballot id are not reused, new ones are generated for each election
  - AUDITOR: Verify name matches address for each registered voter
  - AUDITOR: Verify each registered voter is eligible to vote in next election
  - AUDITOR: Verify cryptographic signature of eligible voter name and address list
- End voter registration certification for next election
  - No new names may be added to the eligible voter list for that election
  - No new ballot ids may be added for that election
  - Number of names must match number of ballot ids
  - PUBLIC: Publish names of each registered voter eligible to vote in next election
  - PUBLIC: Publish the ballot ids for that election
  - PUBLIC: Publish the cryptographic signature of the names and addresses of eligible voters for that election 
  - The public can not associate a ballot id with a particular voter, but each voter will know which ballot id is theirs
- Polls open
  - Polling places shall be geographically located such that every voter can make it to their polling place in person
  - A voting machine will be made available to each voter to confirm their selections
  - When the voter has confirmed their selections, a paper ballot for the polling place will be printed out on durable paper with their ballot id on each page and selections filled in
  - A paper receipt will also be printed out, for the voter to keep, with the voter name, address, ballot id, and selections 
  - At the bottom of the ballot, called the stub, will be a place with the voter address and space for their signature
  - The voter will certify that these selections are accurate and their ballot id matches by signing the bottom of their ballot
  - The poll worker will certify that the voter has voted by checking the voter's id, address, and signature
  - The signature and address will be separated from the rest of the ballot, with the ballots stored in one box, the signature/addresses in another
- Pools close
  - No information from individual polling places will be transmitted until after polls close
  - The voting machines at each district will transmit all ballot information, including which ballot ids correspond to which selections, to the centralized voting system
  - Once all polling places have reported, the centralized voting system will consolidate all of this information into a single document, and cryptographically sign it
  - PUBLIC: Publish a single, cryptographically signed, document, organized by jurisdiction, with ballot ids and corresponding selections, along with a list of names of voters that were eligible to vote, whether they voted or not  
- Vote certification
  - At this point, anyone in the world can tally what the results would be if every vote was legal, and voters can verify their vote was cast correctly
  - Now it is up to auditors to investigate any signs of fraud
  - AUDITOR: Ensure polling places that encountered technical problems are able to get all legally cast votes into the centralized voting system
  - AUDITOR: Investigate duplicate ballot ids, to determine if the fraudulent ones can be identified, or if all ballots with that id must be thrown out
  - AUDITOR: Investigate jurisdictions that produced ballot ids that were not published during voter registration certification
  - AUDITOR: Verify physical ballots and stubs
    - Ensure the number of stubs match the number of ballots
    - Ensure the stubs have signatures
    - Ensure the names and addresses match registered voters
  - AUDITOR: Respond to voters who notice their vote was not cast at all or not cast correctly, voters can prove this with their paper receipts
  - AUDITOR: Send an adjusted report to centralized voting system, so that it may be accounted for in the final tally
  - The central voting system will compute the final tally, rejecting duplicate ballot ids or ballot ids that were not listed during voter registration certification
  - PUBLIC: Publish the final tally, cryptographically signed, which includes all publicly released information to this point, the fraud report, and the tally computed by the centralized voting system    
- Apply results
  - At this point the final tally is the best estimate of the will of the people
  - The application of the people's will is beyond the scope of this voting system
  - The legitimacy of government is derived from the consent of the governed as codified in the constitution and expressed through the constitutions voting system
  - Should the government choose to act against the people, it is up to each executor of the governments will to refuse to enforce unconstitutional orders, and up to each individual to choose for themselves how they can most effectively resist illegitimate government    
