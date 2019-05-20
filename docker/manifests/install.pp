class docker::install {
package {
'curl':ensure  => present,
}
exec {'apt-update':command => '/usr/bin/apt-get update'}
exec {'install_docker':command => '/usr/bin/apt-get install -y docker'}
exec {'install_docker':command => '/usr/bin/apt-get install -y docker'}
}
}
