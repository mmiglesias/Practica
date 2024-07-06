{% for entry in tree %}

## {{ entry.version }}{% if entry.date %} ({{ entry.date }}){% endif %}

{% for change_key, changes in entry.changes.items() %}

{% if change_key %}
### {{ change_key }}
{% endif %}

{% for change in changes %}
{% if change.scope %}
- **{{ change.scope }}**: {{ change.message }}
{% elif change.message %}
- {{ change.message }}
{% endif %}
{% endfor %}
{% endfor %}
{% endfor %}

