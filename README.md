&#00236;k&#07885;k&#07885;
=====

This is a collection of thoughts and ideas about a hypothetical
'social network' (if that's what you want to call it) with a strong
focus on privacy and decentralization, built upon public key
encryption.

As of now there is no code, just this document to collect requirements
and possible designs.

## Name

The name of the project, '&#00236;k&#07885;k&#07885;', is the word for
'secret' in the
[Yoruba language](http://en.wikipedia.org/wiki/Yoruba_language).

## Features on social networks

The following are some of the positive features of existing social
networks that might be supported by project ikoko.

### Sharing of personal information

This is information that is usually found on a profile page, such as
names, aliases, contact information, job experience etc.

This data is used by other users as a reference. It can be updated at
any time, but usually changes infrequently.

### Sharing status updates

These are (more or less) short pieces of text the user wishes to share
publicly or with a defined set of other users.

### Sharing files, especially photos and videos

Same as status updates, but larger amounts of binary data are shared,
usually for direct consumption by others users.

### Sharing of user connections

A user may share a (partial) list of their connections to other users
on the same network. This allows other users to discover common
connections and to discover more users to connect to.

### Discoverability

Social networks may allow sharing information publicly in a searchable
form to allow other users to discover users they may be acquainted
with but are not yet connected to on the network.

## Anti-features of social networks

The following are some of the problems users face with currently
popular social networks that project ikoko should try to avoid.

### Dependency on a central service

All information shared via current social networks passes through and
is stored on the systems that are operated and controlled by the
social network. When the system is unavailable or the entity backing
the system goes out of business can no longer be shared and in the
worst case is lost.

### Not enough control over sharing

Many networks support only limited control over what data is shared
with which users.

### Implicit trust in the network operators

Even if the network allows fine-grained control over sharing data, all
data is implicitly shared with the operators of the network, who have
full access to it. As the operators have mostly financial interest in
maintaining the network, it is unlikely that they always have the
users best interests in mind when handling this data.

### Sharing of data with third parties

Network operators often allow third party developers access to user
data (via some 'app' system). While this technically requires consent
by the user activating the app, the extent of data shared is often
much larger than needed for the use case of an app and often includes
data shared by the users contacts, who did not give their consent.
