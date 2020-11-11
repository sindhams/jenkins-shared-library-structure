
def call(Map stageParams) {
 
    checkout([
        $class: 'GitSCM',
        branches: [[name:  stageParams.branch ]],
        userRemoteConfigs: [[ url: stageParams.url ]],
        changelog: stageParams.changelog,
        poll: stageParams.poll
    ])
  }
