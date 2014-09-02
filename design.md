# Ideas for the Technical Design

A separate feed is generate for every individual user you want to
share something with. The feed is either in RSS or a custom JSON
format. The feed is GPG-encrypted and can only be decrypted by the
target user.

Binary files are symmetrically encrypted with a unique key for every
file. The key is included in the feed files for the users you want to
share the file with.
