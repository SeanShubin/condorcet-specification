# Sound Voting Rights System

## Sound Voting Rights
- You have the right to personally verify that your vote was cast or not according to your choice
- You have the right to personally verify that your vote is accurate
- You have the right to personally verify that your vote was tallied correctly
- You have the right to be free from coercion in how you vote  This right is secured by implementing secret ballot
- Limited only by the constraints necessarily imposed by secret ballot, you have the right to be maximally assured that your vote was not diluted by illegitimate votes
- You have the right to have your complete preferences taken into account, by ranking all choices in your preferred order 
- You have the right to vote honestly, without having to choose the lessor of two evils for fear your honest vote will work against you.  This right is secured by comparing candidates in pairs

## One example implementation of these voting rights
- Note about cryptographic signatures
  - Cryptographic signatures are not needed when the information is made public ahead of time
  - However, for private information that might need to be audited later, such as addresses, the auditor needs to be able to verify the information was not changed after the fact
  - Therefore, the cryptographic signatures of auditable private information need to be made public
- Each district maintains a registry of voters
  - Adds new voters to the registry as they become eligible to vote
  - Removes voters from the registry as they become ineligible to vote
- Begin voter registration certification for the next election
  - Send out voter information packet and unique ballot id to each registered voter
  - Ballot id are not reused, new ones are generated for each election
  - AUDITOR: Verify name matches address for each registered voter
  - AUDITOR: Verify each registered voter is eligible to vote in next election
- End voter registration certification for next election
  - No new names may be added to the eligible voter list for that election
  - No new ballot ids may be added for that election
  - Number of names must match number of ballot ids
  - FOR-PUBLIC: Publish names of each registered voter eligible to vote in next election
  - FOR-PUBLIC: Publish the ballot ids for that election
  - FOR-PUBLIC: Publish the cryptographic signature of the names and addresses of eligible voters for that election 
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
  - FOR-PUBLIC: Publish a single, cryptographically signed, document, organized by jurisdiction, with ballot ids and corresponding selections, along with a list of names of voters that were eligible to vote, whether they voted or not  
- Begin vote certification
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
  - FOR-PUBLIC: Publish the final tally, cryptographically signed, which includes all publicly released information to this point, the fraud report, and the tally computed by the centralized voting system    
- End vote certification
  - At this point the final tally is the best estimate of the will of the people
  - The application of the people's will is beyond the scope of this voting system
  - The legitimacy of government is derived from the consent of the governed as codified in the constitution and expressed through the constitutions voting system
  - Should the government choose to act against the people, it is up to each executor of the governments will to refuse to enforce unconstitutional orders, and up to each individual to choose for themselves how they can most effectively resist illegitimate government    

## How this example secures individual voting rights
- You have the right to personally verify that your vote was cast or not according to your choice
  - If you voted, you should find your ballot id on the public list of ballots cast
  - If you did not vote, you should not find your ballot id on the public list of ballots cast
  - In this way, you can detect if your ballot id becomes compromised and someone impersonates you at the polling place
  - In this way, if you don't vote, you can detect if a corrupt individual at the polling place cast your vote
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
  - When the poll worker separates your stub with your address and signature, from the rest of your ballot, your ballot has now been made secret
- Limited only by the constraints necessarily imposed by secret ballot, you have the right to be maximally assured that your vote was not diluted by illegitimate votes
  - You can check that the number of ballot ids for each jurisdiction matches the number of registered voters in that jurisdiction
  - If there are more registered voters than live in the area, there is voter registration fraud 
  - You can detect duplicate ballot ids in the published final tally document
  - You can detect invalid ballot ids by comparing the ballot ids published during voter registration certification to the ballot ids published in the final tally  
- You have the right to have your complete preferences taken into account, by ranking all choices in your preferred order
  - When a choice between more than 2 outcomes is involved, your vote expresses your complete preference between them
  - This means your first choice, second choice, third choice, and so on, are recorded on your ballot
  - You can also rank outcomes the same if you have no preference between them
  - Outcomes you choose not to rank at all are considered less preferred than any outcomes you do rank
- You have the right to vote honestly, without having to choose the lessor of two evils for fear your honest vote will work against you
  - Each pair of candidates is compared according to your entire rankings, so preferences after your first are not thrown away

### Ballot information
- In custody of voter
  - Ballot Page Receipt
    - Copy of corresponding ballot page
  - Ballot Stub Receipt
    - Ballot Confirmation Number
    - Voter Name
    - Voter Address
- In custody of local polling place
  - Ballot Page
    - Ballot confirmation number
    - Page number
    - How many pages total
    - Selections for that page number
  - Ballot Stub
    - Voter Name
    - Voter Address
    - Voter Signature
- In custody of local voter registration office
  - Voter Registration
    - Voter Name
    - Voter Address
  - List of ballot ids
